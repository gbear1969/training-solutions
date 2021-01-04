package filescanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(Path.of("bucketlist.txt"))) {
            while (sc.hasNextLine()) {
                String l = sc.nextLine();
                System.out.println(l);
            }
        } catch (IOException ioe) {
            System.out.println("Nem tudom olvasni a fájlt.");
        }

    }


}
