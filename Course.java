public class Course {
    String courseName;
    String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    void display() {
        System.out.println("Course Name: " + courseName + ", Code: " + courseCode);
    }

    public static void main(String[] args) {
        Course course = new Course("Java Programming", "CS101");
        course.display();
    }
}
