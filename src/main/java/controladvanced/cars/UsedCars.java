package controladvanced.cars;

import java.util.ArrayList;
import java.util.List;

public class UsedCars {
    public List<String> filterLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(";");
            if (parts.length != 4) {
//Innen kezdve hiányzik jópár sor

                continue;
            }
            if (parts[0].length() != 7 || !parts[0].contains("-") ||
                Integer.parseInt(parts[1]) < 1971 || Integer.parseInt(parts[1]) > 2018) {
                continue;
            }
            validLines.add(line);
        }
        return validLines;
    }
}