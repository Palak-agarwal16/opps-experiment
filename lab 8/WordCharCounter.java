package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCharCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name to analyze: ");
        String fileName = input.nextLine();

        int wordCount = 0;
        int charCount = 0;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count characters excluding whitespace
                charCount += line.replaceAll("\\s+", "").length();
            }

            fileScanner.close();

            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found.");
        }

        input.close();
    }
}
