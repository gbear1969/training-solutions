package ioreadbytes.byteacount;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int readBytesAndFindAs(String path) {
        Path file = Path.of(path);
        int sum = 0;
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] bytes = new byte[1000];
            int size;
            while ((size = inputStream.read(bytes)) > 0) {
                for (int i = 0; i < size; i++) {
                    if (bytes[i] == 97) {
                        sum++;
                    }
                }
            }

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sum;
    }
}
