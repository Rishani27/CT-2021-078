package Q5;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("The given word is palindrome");
        } else {
            System.out.println("The given word is not palindrome");
        }

        input.close();
    }

    public static boolean isPalindrome(String word) {
        word = word.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }

        return word.equals(reverseWord);
    }
}
