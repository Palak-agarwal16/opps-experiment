abstract class Employee {
    String name;
    double salary;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
    abstract void displayDetails();
}