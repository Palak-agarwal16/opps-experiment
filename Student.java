public class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Default Name";
        age = 18;
    }

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // default
        Student s2 = new Student("Riya", 20); // parameterized

        s1.display();
        s2.display();
    }
}
