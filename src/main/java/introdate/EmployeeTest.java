package introdate;

import java.awt.event.InputEvent;
import java.time.LocalDate;
import java.util.Scanner;

import static java.time.LocalDateTime.now;

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner szken = new Scanner(System.in);

        System.out.println("Kérem adja meg az alkalmazott nevét!");
        String neve = szken.nextLine();

        System.out.println("Kérem adja meg az alkalmazott születési évét!");
        int ev = szken.nextInt();
        szken.nextLine();

        System.out.println("Kérem adja meg melyik hónapban született az alkalmazott!");
        int ho = szken.nextInt();
        szken.nextLine();

        System.out.println("Kérem adja meg melyik napon született az alkalmazott!");
        int nap= szken.nextInt();
        szken.nextLine();

        Employee employee = new Employee(neve, LocalDate.of(ev, ho, nap), now());

        System.out.println(employee.getName() + " született: " + employee.getDateOfBirth() + ", belépés: " + employee.getBeginEmployment());

    }
}
