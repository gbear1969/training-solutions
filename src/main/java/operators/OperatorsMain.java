package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators o = new Operators();

        System.out.println(o.isEven(7));
        System.out.println(o.isEven(250));

        String number = Integer.toBinaryString(16); //"10000" = 16
        System.out.println(number);
        number = Integer.toBinaryString(16 >> 1); //"1000" = 8 >>> /2
        System.out.println(number);
        number = Integer.toBinaryString(16 << 1); //"100000" = 32 >>> *2
        System.out.println(number);

        number = Integer.toBinaryString(13); //"10000" = 13
        System.out.println(number);
        number = Integer.toBinaryString(13 >> 1); //"1000" = 6 >>> (-%2)/2
        System.out.println(number);
        number = Integer.toBinaryString(13 << 1); //"100000" = 26 >>> *2
        System.out.println(number);

        System.out.println(o.multiplyByPowerOfTwo(5,6));

        int i = -1;
        String s = Integer.toBinaryString(i);
        System.out.println(s);
        //int j = Integer.parseInt(s, 2); túlcsordulást okoz
        int j = Long.valueOf(s, 2).intValue(); //negatív számként értelmezi a kettes komplementer visszafejtése miatt
        System.out.println(j);


    }
}
