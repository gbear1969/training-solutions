package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageAssembler {
    public void makeImageFile(byte[][] bytes, Path path) {
        Path file = Path.of(path.toString() +"/image.png");
        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(file))) {
            for (int i = 0; i < bytes.length; i++) {
                outputStream.write(bytes[i]);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }
}
