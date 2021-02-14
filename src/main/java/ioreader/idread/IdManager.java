package ioreader.idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {
    private List<String> ids = new ArrayList<>();

    public void readIdsFromFile(String file) {
        Path source = Path.of("src/main/resources/" + file);
        try (BufferedReader reader = Files.newBufferedReader(source)) {
            String line;
            while((line = reader.readLine()) != null) {
                ids.add(line);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public List<String> getIds() {
        return new ArrayList<>(ids);
    }
}
