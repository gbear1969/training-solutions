package week08d03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringLists sl = new StringLists();
        List<String> first = new ArrayList<>("a", "b", "c");
        List<String> second = new ArrayList<>("a", "d");
        System.out.println(sl.stringListsUnion(first, second));
    }
}
