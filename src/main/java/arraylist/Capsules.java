package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList<>();

    public void addFirst(String color) {
        colors.add(0, color);
    }
    public void addLast(String color) {
        colors.add(color);
    }
    public void removeFirst() {
        colors.remove(0);
    }
    public void removeLast() {
        colors.remove(colors.size() - 1);
    }

    public List<String> getColors() {
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("sárga");
        capsules.addLast("lila");
        capsules.addLast("barna");
        capsules.addLast("zöld");
        System.out.println("4 szín: " + capsules.getColors());
        capsules.removeFirst();
        System.out.println("1. ki: " + capsules.getColors());
        capsules.addFirst("piros");
        System.out.println("Új első: " + capsules.getColors());
        capsules.removeLast();
        System.out.println("Utolsó ki: " + capsules.getColors());
        List<String> clearedColors = new ArrayList<>();
        clearedColors = capsules.getColors();
        clearedColors.clear();
        System.out.println("Bónusz 1.: " + clearedColors);



    }

}
