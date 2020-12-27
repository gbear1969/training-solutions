package intromethods;

public class EmployeMain {
    public static void main(String[] args) {
        Employee e = new Employee("John Doe",2012, 325_000);

        System.out.println(e.getName() + " " + e.getHiringYear() + " " + e.getSalery());

        e.setName("John 2 Doe");
        e.raiseSalary(32_500);
        System.out.println(e.toString());
    }
}
