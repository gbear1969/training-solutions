package debug.employees;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> company;

    public Company(List<Employee> company) {
        this.company = company;
    }

    public void addEmployee(Employee e) {
        company.add(e);
    }

    public Employee findEmployeeByName(String name) {
        for (Employee e: company) {
            if (name.equalsIgnoreCase(e.getName())) {
                return e;
            }
        }
        return  null;
    }

    public List<String> listEmployeeNames() {
        List<String> names = new ArrayList<>();
        for (Employee e: company) {
            names.add(e.getName());
        }
        return names;
    }

}
