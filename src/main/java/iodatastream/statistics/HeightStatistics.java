package iodatastream.statistics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {
    public void saveHeights(List<Integer> heights, Path file) {
        try (DataOutputStream outputStream = new DataOutputStream(
                new BufferedOutputStream(Files.newOutputStream(file)))) {
            outputStream.writeInt(heights.size());
            for (Integer h: heights
                 ) {
                outputStream.writeInt(h);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
