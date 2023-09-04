package eu.luminis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTest {

    @Test
    void sum() {
        assertEquals(3, Sample.sum(1, 2));
    }

}