package OOPS.Employee_Hashmap;

public class Execution {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Hrithik",22,55000,"software developer");
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.addEmployee(employee1.getId(), employee1);

        employeeRepository.listEmployees();
    }
}
