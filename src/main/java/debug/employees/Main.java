package debug.employees;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(new ArrayList<>());
        company.addEmployee(new Employee("John Doe", 1980));
        company.addEmployee(new Employee("Jack Doe", 1981));
        company.addEmployee(new Employee("Jane Doe", 1982));
        System.out.println(company.findEmployeeByName("jack doe").getName() + " (" + company.findEmployeeByName("jack doe").getYearOfBirth() + ")");
        System.out.println(company.listEmployeeNames());
    }
}
