class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void calculateSalary() {
        salary = 50000; // Fixed salary
    }

    void displayDetails() {
        System.out.println("Manager Name: " + name + ", Salary: " + salary);
    }
}