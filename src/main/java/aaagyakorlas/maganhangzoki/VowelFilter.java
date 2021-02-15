package aaagyakorlas.maganhangzoki;

import ioreader.grades.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VowelFilter {
    private final String VOwELS = "aáeéiíoóöőuúüű";

    public String filterFowels(BufferedReader reader) throws IOException {
        try (reader) {
            String line = reader.readLine();
            StringBuilder filtered = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (VOwELS.contains(Character.toString(c).toLowerCase())) {
                        filtered.append(c);
                    }
                }
                filtered.append("\n");
            }
            return filtered.toString();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
