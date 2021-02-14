package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void readGradesFromFile(String file) {
        Path source = Path.of("src/main/resources/" + file);
        try (BufferedReader reader = Files.newBufferedReader(source)) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                List<Integer> marks = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    marks.add(Integer.parseInt(parts[i]));
                }
                students.add(new Student(parts[0], marks));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public double classAverage() {
        double sum = 0;
        for (Student s: students) {
            sum += s.average();
        }
        return sum / students.size();
    }
}
