package exceptions.faults;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FaultList {
    private List<String> faults;
    private String number = "";

    public List<String> processLines(List<String> lines) {
        if (lines == null) {
            throw new IllegalArgumentException();
        }
        faults = new ArrayList<>();
        for (String line: lines) {
            if (processLine(line).getCode() > 1) {
                faults.add(number + processLine(line).getCode());
            }
        }
        return faults;
    }

    private ProcessingResult processLine(String line) {
        ProcessingResult result = ProcessingResult.COMMENT;
        String[] parts = line.split(",");
        number = parts[0] + ",";
        if (parts.length != 3) {
            return ProcessingResult.WORD_COUNT_ERROR;
        }
        if (isNotValidValue(parts[0])) {
            return result;
        }
        int code = 0;
        if (isNotValidValue(parts[1])) {
            code = 4;
        }
        if (isNotValidDate(parts[2])) {
            code += 8;
        }
        if (code != 0) {
            for (ProcessingResult e: ProcessingResult.values()) {
                if (e.getCode()==code) {
                    return e;
                }
            }
        }
        return ProcessingResult.NO_ERROR;
    }

    private boolean isNotValidValue(String str) {
        try {
            Double a = Double.parseDouble(str);
            return false;
        } catch (NumberFormatException nfe) {
            return true;
        }
    }

    private boolean isNotValidDate(String dS) {
            try {
                DateFormat date = new SimpleDateFormat("yyyy.MM.dd.");
                date.parse(dS);
                return false;
            } catch (ParseException e) {
                return true;
            }
    }
}
