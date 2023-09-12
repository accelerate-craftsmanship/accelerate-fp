package util.lucene;

import org.apache.lucene.document.Document;

import java.util.List;

public interface DataStore {
    void addDocuments(Iterable<Document> documents);

    List<Document> search(String queryText);
}
