public class EmployeeTest {
    public static void main(String[] args) {
        Employee m = new Manager("Riya");
        Employee d = new Developer("Vishwas");

        m.calculateSalary();
        d.calculateSalary();

        m.displayDetails();
        d.displayDetails();
    }
}