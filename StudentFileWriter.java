package Lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        // Writing to the file
        try {
            FileWriter writer = new FileWriter("student.txt", true); // 'true' enables append mode
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            writer.close();
            System.out.println("Student information saved successfully to student.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

