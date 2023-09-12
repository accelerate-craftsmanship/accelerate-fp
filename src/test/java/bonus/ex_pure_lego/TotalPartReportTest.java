package bonus.ex_pure_lego;

import org.junit.jupiter.api.Test;
import util.lucene.DataStore;
import util.lucene.InMemLuceneIndex;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TotalPartReportTest {

    private final List<LegoSet> catalog = List.of(
            new LegoSet("Classic Bricks", 10698, 484),
            new LegoSet("Star Wars Millennium Falcon", 75105, 1329),
            new LegoSet("City Police Station", 60246, 743)
    );

    @Test
    void calculateTotalParts() {
        DataStore dataStore = new InMemLuceneIndex();
        dataStore.addDocuments(catalog.stream().map(LegoSet::toDocument).toList());
        TotalPartReport report = new TotalPartReport(dataStore);

        int result = report.calculateTotalParts();

        assertEquals(2556, result);
    }

}

