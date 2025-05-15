package Q6;

import java.util.Scanner;
import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }

        input.close();
    }
}

