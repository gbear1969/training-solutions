package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        try (reader) {
            String line;
            StringBuilder stars = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                stars.append("*".repeat(Integer.parseInt(line)));
                stars.append("\n");
            }
            return stars.toString();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}


