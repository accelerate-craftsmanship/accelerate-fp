package ex_no_assignments;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotsOfAssignmentsTest {

    @Test
    void shouldIgnoreMinors() {
        // Given
        var people = List.of(
                new LotsOfAssignments.Person("Henk", 51, "Den Haag"),
                new LotsOfAssignments.Person("Karin", 19, "Amsterdam"),
                new LotsOfAssignments.Person("Heleen", 35, "Nijmegen")
        );

        // When
        java.util.List<String> residences = LotsOfAssignments.peopleResidences(people.asJava());
        // Note: when using vavr.io, above line should become
        // List<String> residences = LotsOfAssignments.peopleResidences(people);

        // Then
        assertEquals(2, residences.size());
        assertTrue(residences.contains("Den Haag"));
        assertTrue(residences.contains("Nijmegen"));
    }

    @Test
    void shouldFilterDuplicateResidences() {
        // Given
        var people = List.of(
                new LotsOfAssignments.Person("Henk", 51, "Den Haag"),
                new LotsOfAssignments.Person("Heleen", 35, "Den Haag")
        );

        // When
        java.util.List<String> residences = LotsOfAssignments.peopleResidences(people.asJava());
        // Note: when using vavr.io, above line should become
        // List<String> residences = LotsOfAssignments.peopleResidences(people);

        // Then
        assertEquals(1, residences.size());
        assertTrue(residences.contains("Den Haag"));
    }
}