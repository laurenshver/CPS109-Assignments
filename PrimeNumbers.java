package Assignments109;
public class PrimeNumbers {

    public static void main(String[] args) {
        int count = 1;
        int num = 2;
        int counter = 0;
        for (int i = 1; i <= 50;) {
            for (int n = 2; n <= num / 2; n++) {
                if (num % n == 0) {
                    count = 0;
                    break;
                }
            }
            if (count != 0) {
                System.out.print(num + " ");
                i++;
                counter++;
                if (counter % 10 ==0){System.out.println();}

            }
            count = 1;
            num++;
        }









    }
}