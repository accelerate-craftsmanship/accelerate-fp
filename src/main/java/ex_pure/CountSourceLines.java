package ex_pure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountSourceLines {

    public static long countSourceLines(Path sourceFile) throws IOException {
        long counter = 0;
        List<String> allLines = Files.readAllLines(sourceFile);
        for (int i = 0; i < allLines.size(); i++) {
            String line = allLines.get(i);
            if (!line.trim().isEmpty()) {
                counter++;
            }
        }
        return counter;
    }

}
