package bonus.ex_pure_lego;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;

public record LegoSet(String setName, int setNumber, int partsInSet) {
    public Document toDocument() {
        Document document = new Document();
        document.add(new TextField("name", setName, Field.Store.YES));
        document.add(new TextField("number", Integer.toString(setNumber), Field.Store.YES));
        document.add(new TextField("partsInSet", Integer.toString(partsInSet), Field.Store.YES));
        return document;
    }
}