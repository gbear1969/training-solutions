package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostFinder pF = new PostFinder(new ArrayList<>(List.of(
                new Post("próba", LocalDate.of(2020, 7, 20), "valami", "valaki"),
                new Post("próba", LocalDate.of(2021, 7, 20), "valami", "valaki"),
                new Post("", LocalDate.of(2020, 7, 20), "valami", "valaki"),
                new Post("próba", LocalDate.of(2020, 7, 20), "", "valaki"),
                new Post("próba", LocalDate.of(2020, 7, 20), "valami", "akárki")
                )));
        System.out.println(pF.findPostsFor("valaki").get(0).toString());
    }


}
