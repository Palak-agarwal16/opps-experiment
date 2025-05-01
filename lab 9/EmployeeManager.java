import java.util.ArrayList;

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aman", 101, 50000));
        employees.add(new Employee("Riya", 102, 60000));
        employees.add(new Employee("Parul", 103, 55000));

        // Update salary of employee with id 102
        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 65000;
            }
        }

        // Remove employee with id 101
        employees.removeIf(emp -> emp.id == 101);

        // Display remaining employees
        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
