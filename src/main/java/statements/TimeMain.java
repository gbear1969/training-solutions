package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner szkenner = new Scanner(System.in);
        System.out.println("Kérem adjon meg egy időpontot! Óra?");
        int hours = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println("Perc?");
        int minutes = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println("Másodperc?");
        int seconds = szkenner.nextInt();
        szkenner.nextLine();

        Time time1 = new Time(hours, minutes, seconds);

        System.out.println("Kérem adjon meg egy másik időpontot is! Óra?");
        hours = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println("Perc?");
        minutes = szkenner.nextInt();
        szkenner.nextLine();
        System.out.println("Másodperc?");
        seconds = szkenner.nextInt();
        szkenner.nextLine();

        Time time2 = new Time(hours, minutes, seconds);

        System.out.println(time1.toString() + " = " + time1.getInMinutes());
        System.out.println(time2.toString() + " = " + time2.getInSeconds());
        System.out.println(time1.earlierThan(time2));
    }
}
