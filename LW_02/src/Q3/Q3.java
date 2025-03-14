package Q3;
import java.util.Scanner;

import static java.lang.System.*;

public class Q3  {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(in)) {
            out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (1.8 * celsius) + 32;
            out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
            out.println("Please enter a valid number.");
            scanner.close();
        }
    }
}
