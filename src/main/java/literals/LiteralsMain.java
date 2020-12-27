package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("" + 1 + 2);
        System.out.println(Integer.toString(1).concat(String.valueOf(2)));

        double quocient = 3 / 4;
        System.out.println(quocient);

        quocient = 3.0 / 4;
        System.out.println(quocient);

        quocient = 3d / 4;
        System.out.println(quocient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String s = "árvíztűrőtükörfúrógép";
        System.out.println(s);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
