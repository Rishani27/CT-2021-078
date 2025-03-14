package Q1;

public class Q1 {
    public static void main(String[] args) {
       // a.The square root of B  2  + 4AC//
        int A=10;
        int B=20;
        int C=30;
        double output1 = Math.sqrt(B*B+4*A*C);
        System.out.println(output1);
        // b.  The square root of X + 4Y  3//
        int X=40;
        int Y=50;
        double output2 = Math.sqrt(X + 4 * Math.pow(Y, 3));
        System.out.println(output2);
        // c. The cube root of the product of X and Y //
        double output3= Math.cbrt(X * Y);
        System.out.println(output3);
        // d. The area of a circle
        int r=7;
        double output4 = Math.PI * Math.pow (r,2);
        System.out.println(output4);
    }
}

