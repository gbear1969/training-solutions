package iowriter.names;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NameWriter {
    private Path file;
    private List<String> names = new ArrayList<>();

    public NameWriter(Path file) {
        this.file = file;
    }

    public Path getFile() {
        return file;
    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public void addAndWrite(String name) {
        names.add(name);
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.APPEND)) {
                writer.write(name + "\n");
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }

    }
}
