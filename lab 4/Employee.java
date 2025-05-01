public class Employee {
    private static int totalEmployees = 0;
    private static double totalSalaryExpenditure = 0;

    private int empId;
    private String name;
    private String department;
    private double salary;

    // Default constructor
    Employee() {
        this.empId = ++totalEmployees;
        this.name = "Default";
        this.department = "General";
        this.salary = 30000;
        totalSalaryExpenditure += this.salary;
    }

    // Parameterized constructor
    Employee(String name, String department, double salary) {
        this.empId = ++totalEmployees;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalSalaryExpenditure += this.salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary);
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void displayTotalSalaryExpenditure() {
        System.out.println("Total Salary Expenditure: " + totalSalaryExpenditure);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();  // default
        Employee e2 = new Employee("Riya Jain", "IT", 45000); // parameterized
        Employee e3 = new Employee("Vishwas Sharma", "HR", 55000);

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
        e3.displayEmployeeInfo();

        displayTotalEmployees();
        displayTotalSalaryExpenditure();
    }
}
