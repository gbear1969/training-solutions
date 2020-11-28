package arrayofarrays;

public class ArrayOfArraysMain {
    public int[][] multiplicationTable(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public int[][] triangularMatrix(int size) {
        int[][] table = new int[size][];
        for (int i = 0; i < size; i++) {
            table[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                table[i][j] = i;
            }
        }
        return table;
    }

    public void printArrayOfArrays(int[][] a) {
        for (int i[] : a) {
            for (int j : i) {
                if (j < 100) {
                    System.out.print(" ");
                }
                if (j < 10) {
                    System.out.print(" ");
                }
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public int[][] getValues() {
        int[][] table = new int[12][];
        for (int i = 1; i < 13; i++) {
            switch (i) {
                case 2:
                    table[i - 1] = new int[28];
                    break;
                case 4: case 6: case 9: case 11:
                    table[i - 1] = new int[30];
                    break;
                default:
                    table[i - 1] = new int[31];
                    break;
            }
        }
        return table;
    }

    public static void main(String[] args) {
       ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        System.out.println("Multiplication table");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.multiplicationTable(12));

        System.out.println("Tringular Matrix");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.triangularMatrix(4));

        System.out.println("Calendar");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.getValues());

    }
}
