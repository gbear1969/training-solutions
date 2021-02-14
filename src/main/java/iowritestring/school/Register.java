package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path file, int mark) {
        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(mark) + "\n");
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }
    }

    public void average(Path file) {
        double average;
        try {
            List<String> marks = Files.readAllLines(file);
            double sum = 0;
            for (String m : marks) {
                sum += Integer.parseInt(m);
            }
            average = sum / marks.size();
            Files.writeString(file, "average: " + average + "\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new IllegalStateException("Can't reach file!", e);
        }
    }
}
