package bonus.part_x_immutable;

import bonus.part_x_immutable.LookMaNoAssignments;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class LookMaNoAssignmentsTest {

    private final List<Integer> input = new ArrayList<>(List.of(1, 2, 3, 4, 5));

    @Disabled // remove this line
    @Test
    void verifyDoubleEach() {
        var result = LookMaNoAssignments.doubleEach(input);
        assertEquals(List.of(2, 4, 6, 8, 10), result);
        assertNotSame(input, result);
    }

    @Disabled // remove this line
    @Test
    void verifyFilterEven() {
        var result = LookMaNoAssignments.filterEven(input);
        assertEquals(List.of(2, 4), result);
        assertNotSame(input, result);
    }

    @Disabled // remove this line
    @Test
    void verifySumAll() {
        var result = LookMaNoAssignments.sumAll(input);
        assertEquals(15, result);
    }

}