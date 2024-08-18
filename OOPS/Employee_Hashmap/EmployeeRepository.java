package OOPS.Employee_Hashmap;

import java.util.HashMap;

public class EmployeeRepository {
    private HashMap<Integer, Employee> employees = new HashMap<>();

    // Add an employee
    public void addEmployee(int id, Employee employee) {
        employees.put(id, employee);
    }

    // Remove an employee
    public void removeEmployee(int id) {
        employees.remove(id);
    }

    // Get an employee by ID
    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    // List all employees
    public void listEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }
}
