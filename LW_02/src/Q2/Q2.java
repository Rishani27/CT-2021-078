package Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter length in centimeters: ");
                double cm = scanner.nextDouble();
                final double CM_PER_INCH = 2.54;
                final int INCHES_PER_FOOT = 1;
                double totalInches = cm / CM_PER_INCH;
                int feet = (int) (totalInches / INCHES_PER_FOOT);
                double inches = totalInches % CM_PER_INCH;
                System.out.printf("%.2f cm is %d feet and %.2f inches\n", cm, feet, inches);
                scanner.close();
            }
        }



