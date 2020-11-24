package array;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {
        for (int elem: source) {
            if (elem == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayHandler arrayHandler = new ArrayHandler();
        int[] teszt = new int[]{1, 2, 3, 5};
        System.out.println(arrayHandler.contains(teszt, 3));
        System.out.println(arrayHandler.contains(teszt, 4) + "\n");

        System.out.println(arrayHandler.find(teszt, 3));
        System.out.println(arrayHandler.find(teszt, 4));
    }
}
