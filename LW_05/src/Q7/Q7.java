package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String choice;


        do {

            System.out.print("Enter the word to be replaced: ");
            String oldWord = input.nextLine();

            System.out.print("Enter the replacement word: ");
            String newWord = input.nextLine();

            sentence = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);


            System.out.println("Updated sentence: " + sentence);
            System.out.print("Do you want to replace another word? (yes/no): ");
            choice = input.nextLine().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Final sentence: " + sentence);

        input.close();
    }
}

