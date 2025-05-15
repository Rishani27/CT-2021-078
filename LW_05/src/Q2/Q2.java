package Q2;
import java.util.Scanner;

public class Q2 {
    public static  int countDigits (int number) {
        return String.valueOf(Math.abs(number)).length();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while(true)
        {
            System.out.print("Enter a Number: ");
            int input =scanner.nextInt();
            if(input <-1)
            {
                System.out.println("it is negative number");
                break;
            }
            System.out.println("Number of Digits : " + countDigits(input));
        }
        scanner .close();
    }
}
