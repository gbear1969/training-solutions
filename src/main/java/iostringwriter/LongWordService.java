package iostringwriter;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public String writeWithStringWriter(List<String> words) {
        StringWriter sw = new StringWriter();
        toWrite(sw, words);
        return sw.toString();
    }

    public void toWrite(Writer writer, List<String> words) {
        try {
            for (String word : words) {
                writer.write(word);
                writer.write(Integer.toString(word.length()));
                writer.write("\n");
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
