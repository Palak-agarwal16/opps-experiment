public class University {
    static String universityName = "UPES";
    String studentName;

    University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    void displayStudent() {
        System.out.println("Student: " + studentName);
    }

    public static void main(String[] args) {
        University.displayUniversity();

        University s1 = new University("Aman");
        University s2 = new University("Varchasv");

        s1.displayStudent();
        s2.displayStudent();
    }
}
