package primitivetypes;

public class PrimitiveTypes {
    public String toBinaryString(int n) {
        int nOB = 32;
        int a = n < 0 ? Math.abs(n) - 1 : Math.abs(n);
        int b = 0;
        String bS = "";
        for (int i = nOB; i > 0; i--) {
                b= n < 0 ? Math.abs((a % 2) - 1) : a % 2;
                bS = Integer.toString(b) + bS;
                a = a / 2;
        }
        return bS;
    }

    public static void main(String[] args) {
        PrimitiveTypes pT = new PrimitiveTypes();
        int a = 16606;
        int b = - a;
        String s = " ";
        s = " ".repeat(32 - Integer.toBinaryString(a).length());

        System.out.println(a + " binárisként (saját):  " + pT.toBinaryString(a));
        System.out.println(a + " binárisként: (JAVA)   " + s + Integer.toBinaryString(a));
        System.out.println(b + " binárisként (saját): " + pT.toBinaryString(b));
        System.out.println(b + " binárisként (JAVA):  " + Integer.toBinaryString(b));

        System.out.println(new Integer(1) + new Integer(2)); //autoboxing
    }
}
