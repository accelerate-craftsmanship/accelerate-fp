package bonus.ex_pure_lego;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexableField;
import util.lucene.DataStore;

import java.util.List;

public class TotalPartReport {

    private final DataStore dataStore;

    public TotalPartReport(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public int calculateTotalParts() {
        int totalParts = 0;
        List<Document> results = dataStore.search("*:*");
        for (Document doc : results) {
            IndexableField partsInSet = doc.getField("partsInSet");
            if (partsInSet != null) {
                totalParts += Integer.parseInt(partsInSet.stringValue());
            }
        }
        return totalParts;
    }

}
