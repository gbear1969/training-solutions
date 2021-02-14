package iowriter.music;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class BandManager {
    private List<Band> bands = new ArrayList<>();

    public void readBandsFromFile(Path file) {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                bands.add(new Band(parts[0], Integer.parseInt(parts[1])));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void writeBandsBefore(Path file, int year) {
        List<Band> olders = olderThan(year);
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.APPEND)) {
            for (Band o: olders) {
                writer.write(o.toString() + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }
    }

    private List<Band> olderThan(int max) {
        List<Band> olders = new ArrayList<>();
        for (Band b: bands) {
            if (b.getYear() < max) {
                olders.add(b);
            }
        }
        return olders;
    }
}
