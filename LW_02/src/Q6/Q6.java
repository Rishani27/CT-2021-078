package Q6;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = 2025;
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int age = currentYear - birthYear;

        // Handling if the person has already had their birthday this year
        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");

        scanner.close();
    }
}

