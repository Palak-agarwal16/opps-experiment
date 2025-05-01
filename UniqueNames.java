import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        HashSet<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }

        // Check if a name exists
        String checkName = "Sourabh";
        if (uniqueNames.contains(checkName)) {
            System.out.println(checkName + " exists in the set.");
        }

        // Display unique names
        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}

