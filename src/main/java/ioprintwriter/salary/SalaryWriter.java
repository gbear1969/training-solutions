package ioprintwriter.salary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {
    private List<String> names = new ArrayList<>();

    public SalaryWriter(List<String> names) {
        this.names.addAll(names);
    }

    public List<String> getNames() {
        return new ArrayList<>(names);
    }

    public void writeNamesAndSalaries(Path file) {
        int salary = 100000;
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String name: names) {
                salary = 100000;
                if (name.startsWith("Dr")) salary = 500000;
                if (name.startsWith("Mr")) salary = 200000;
                writer.print(name);
                writer.print(": ");
                writer.println(salary);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
