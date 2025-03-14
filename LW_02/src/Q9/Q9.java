package Q9;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount (P): ");
        double P = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (R) in percentage: ");
        double R = scanner.nextDouble();
        System.out.print("Enter the number of years (N): ");
        int N = scanner.nextInt();
        double amount = P * Math.pow(1 + (R / 100), N);
        double earnings = amount - P;
        System.out.println("The amount after " + N + " years is: " + amount);
        System.out.println("The earnings after " + N + " years is: " + earnings);
        scanner.close();
    }
}
