package recursion;

public class FactorialCalculator {

    public long getFactorial(int number){
        long fakt = 0;
        if (number > 1) {
            fakt = getFactorial(number - 1);
            return number * fakt;
        } else {
            return 1;
        }

    }
}
