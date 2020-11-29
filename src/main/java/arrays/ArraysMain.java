package arrays;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek() {
        return Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
    }

    public String multiplicationTableAsString(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public int min(int min1, int min2) {
        if (min1 < min2) {
            return min1;
        } else {
            return min2;
        }
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int min = min(day.length, anotherDay.length);
        day = copyOfRange(day, 0, min);
        anotherDay = copyOfRange(anotherDay, 0, min);
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] tipp, int[] nyer) {
        int[] tippSor = copyOf(tipp, tipp.length);
        int[] nyerSor = copyOf(nyer, nyer.length);
        Arrays.sort(tippSor);
        Arrays.sort(nyerSor);
        return Arrays.equals(tippSor, nyerSor);
    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println("Napok száma: " + arraysMain.numberOfDaysAsString());

        System.out.println("Hét napjai: " + arraysMain.daysOfWeek());

        System.out.println("Szorzótábla: " + arraysMain.multiplicationTableAsString(4));
        System.out.println();

        System.out.println("Egyező hőmérsékleteknél: " + arraysMain.sameTempValues(new double[]{2.1, 3.3, 4}, new double[]{2.1, 3.3, 4.0}));
        System.out.println("Különböző hossznál: " + arraysMain.sameTempValuesDaylight(new double[]{2.1, 3.3, 4, 5}, new double[]{2.1, 3.3, 4.0}));
        System.out.println("Különböző hőmérsékleteknél: " + arraysMain.sameTempValues(new double[]{2.2, 3.3, 4}, new double[]{2.1, 3.3, 4.0}));
        System.out.println();

        int[] tipp = new int[]{13, 2, 43, 89, 26};
        int[] tippRossz = new int[]{13, 22, 43, 89, 26};
        int[] nyer = new int[]{43, 26, 13, 89, 2};
        System.out.println("Nyertes tippnél: " + arraysMain.wonLottery(tipp, nyer));
        System.out.println("Vesztes tippnél: " + arraysMain.wonLottery(tippRossz, nyer));
        System.out.println("Nyerőszámok: " + Arrays.toString(nyer));
    }
}
