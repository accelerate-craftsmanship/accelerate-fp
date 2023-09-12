package ex_pure;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountSourceLinesTest {

    @Test
    void countSourceLines() throws URISyntaxException, IOException {
        Path longTextFile = Path.of(ClassLoader.getSystemResource("ex_pure/lipsum.txt").toURI());

        long result = CountSourceLines.countSourceLines(longTextFile);

        assertEquals(120, result);
    }

}