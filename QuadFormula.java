package Assignments109;

import java.lang.Math;

public class QuadFormula {


    public static double discriminant(int a, int b, int c){
        double d = Math.pow(b,2) - (4*a*c);
        return d;
    }

    public static double denominator(int a) {
        double f = 2 * a;
        return f;
    }

    public static void main(String args[]) {

        int a = 2;
        int b = 4;
        int c = 2;
        double desc = discriminant(a, b, c);
        if (desc < 0) {
            System.out.println("There are no real roots.");
            return;
        }

        double squareroot= Math.sqrt(desc);


        double denom = denominator(a);

        double root1= -b + squareroot / denom;
        double root2= -b - squareroot/ denom;

        if (desc > 0) {
            System.out.println("There are 2 real roots. They are " +root1 +root2);
        }
        if (desc == 0) {
            System.out.println( "There is 1 real root. It is " +root1);
        }
    }
}
