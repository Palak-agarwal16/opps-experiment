class Developer extends Employee {
    int hoursWorked = 160;
    double ratePerHour = 300;

    Developer(String name) {
        super(name);
    }

    void calculateSalary() {
        salary = hoursWorked * ratePerHour;
    }

    void displayDetails() {
        System.out.println("Developer Name: " + name + ", Salary: " + salary);
    }
}