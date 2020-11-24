package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] hetNapjai = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println("A második elem: " + hetNapjai[1]);
        System.out.println(hetNapjai.length + " elem a tömbben" + "\n");

        int[] kettoHatvanyai = new int[5];
        for (int i = 0; i < 5; i++) {
            kettoHatvanyai[i] = (int) Math.pow(2, i);
        }
        for (int elem: kettoHatvanyai
             ) {
            System.out.println(elem);
        }
        System.out.println();

        boolean[] logi = new boolean[6];
        for (int i = 0; i < logi.length; i++) {
            logi[i] = i % 2 != 0;
        }
        for (boolean elem: logi
             ) {
            System.out.println(elem);
        }
    }
}
