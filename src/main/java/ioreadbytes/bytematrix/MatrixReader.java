package ioreadbytes.bytematrix;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {
    private List<byte[]> myMatrix = new ArrayList<>();

    public List<byte[]> getMyMatrix() {
        return new ArrayList<>(myMatrix);
    }

    public void readBytesAndCreateMatrix(String path) {
        Path file = Path.of(path);
        try (InputStream inputStream = Files.newInputStream(file)) {
            byte[] bytes = new byte[1000];
            while (inputStream.read(bytes) > 0) {
                myMatrix.add(bytes);
            }

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int numberOfColumnsWhereMoreZeros() {
        int number = 0;
        for (int i = 0; i < myMatrix.get(0).length; i++) {
            int zero = 0;
            for (byte[] b: myMatrix) {
                if (b[i] == (byte) '0') zero++;
            }
            if(zero > myMatrix.size() - zero) number++;
        }
        return number;
    }

}
