package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();
        System.out.println("You need " + (weight * 19) + " calories per day.");
        scanner.close();
    }
}

