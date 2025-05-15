package Q3;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number:");
        int N =s.nextInt();

        for (int i=1;i<=10;i++)
        {
            int result = N*i;
            System.out.println(N + "*" + i +" = " + result);
        }

    }
}
