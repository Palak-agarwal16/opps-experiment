
import java.util.Scanner;

public class FinalGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        int m1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int m2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int m3 = scanner.nextInt();

        double average = (m1 + m2 + m3) / 3.0;
        String grade;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 50)
            grade = "C";
        else
            grade = "F";

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
