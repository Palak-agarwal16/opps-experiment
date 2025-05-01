import java.util.ArrayList;

public class PrimeCheck {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Autoboxing: adding int values directly
        for (int i = 2; i <= 20; i++) {
            numbers.add(i); 
        }

        for (Integer num : numbers) {
            int n = num; // Unboxing
            if (isPrime(n)) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
