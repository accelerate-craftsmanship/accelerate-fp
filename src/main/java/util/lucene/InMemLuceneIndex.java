package util.lucene;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.ByteBuffersDirectory;
import org.apache.lucene.store.Directory;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InMemLuceneIndex implements DataStore, Closeable {

    private final Directory inMemoryIndex = new ByteBuffersDirectory();

    @Override
    public void addDocuments(Iterable<Document> documents) {
        try (IndexWriter indexWriter = new IndexWriter(inMemoryIndex, new IndexWriterConfig(new StandardAnalyzer()))) {
            indexWriter.addDocuments(documents);
            indexWriter.commit();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Document> search(String queryText) {
        return withIndexSearcher((indexSearcher) -> {
            try {
                Query query = parseQuery(queryText);
                TopDocs topDocs = indexSearcher.search(query, 10);
                return retrieveMatchingDocuments(topDocs, indexSearcher);
            } catch (IOException | ParseException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private <T> T withIndexSearcher(Function<IndexSearcher, T> block) {
        try (IndexReader indexReader = DirectoryReader.open(inMemoryIndex)) {
            IndexSearcher indexSearcher = new IndexSearcher(indexReader);
            return block.apply(indexSearcher);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Query parseQuery(String queryText) throws ParseException {
        StandardAnalyzer analyzer = new StandardAnalyzer();
        QueryParser queryParser = new QueryParser("name", analyzer);
        return queryParser.parse(queryText);
    }

    private static List<Document> retrieveMatchingDocuments(TopDocs topDocs, IndexSearcher indexSearcher) throws IOException {
        List<Document> matchingDocuments = new ArrayList<>();
        for (ScoreDoc scoreDoc : topDocs.scoreDocs) {
            Document document = indexSearcher.storedFields().document(scoreDoc.doc);
            matchingDocuments.add(document);
        }
        return matchingDocuments;
    }

    @Override
    public void close() throws IOException {
        inMemoryIndex.close();
    }
}
