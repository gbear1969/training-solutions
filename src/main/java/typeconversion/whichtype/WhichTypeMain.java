package typeconversion.whichtype;

public class WhichTypeMain {
    public static void main(String[] args) {
        WhichType wT = new WhichType();

        System.out.println(wT.whichType(Long.toString(Long.MAX_VALUE - 1)));
        System.out.println(wT.whichType(Long.toString((long)Byte.MAX_VALUE - 1)));
        System.out.println(wT.whichType(Long.toString((long)Short.MAX_VALUE - 1)));
        System.out.println(wT.whichType(Long.toString((long)Integer.MAX_VALUE - 1)));

    }
}
