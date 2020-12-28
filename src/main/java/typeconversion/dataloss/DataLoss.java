package typeconversion.dataloss;


public class DataLoss {
    public void dataLoss() {
        long i = 1;
        int j = 0;
        long k;
        while (j < 3) {
            k= (long) ((float) i);
            if (i != k) {
                System.out.println("Eredeti szám:    " + i);
                System.out.println("Konvertált szám: " + k);
                System.out.println("Eltérés:         " + (k - i));
                System.out.println("Eredeti szám binárisan:    " + Long.toBinaryString(i));
                System.out.println("Konvertált szám binárisan: " + Long.toBinaryString(k));
                System.out.println();
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        DataLoss dL = new DataLoss();
        dL.dataLoss();
    }
} // A probléma a 25. bináris számjegy elérésénél jelentkezik (16_777_217), mindig páratlan számnál, az eltérés +/-1.
