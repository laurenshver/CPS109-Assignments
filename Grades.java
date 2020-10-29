package Assignments109;
import java.util.Scanner;

public class Grades {


    public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    int grades;
    System.out.println("Enter a grade between 0 and 100: ");
    grades= scan.nextInt();
    if (grades <0 | grades > 100){
        System.out.println("Error: Value Out of Range");
    } else if (grades >= 0 && grades <= 49){
        System.out.println("Your grade is F");
    } else if (grades >= 50 && grades <=59){
        System.out.println("Your grade is P");
    } else if (grades >= 60 && grades <= 69){
        System.out.println("Your grade is D");
    } else if (grades >=70 && grades <=79){
        System.out.println("Your grade is C");
    } else if (grades >= 80 && grades <= 89){
        System.out.println("Your grade is B");
    } else if (grades >=90 && grades <=100){
        System.out.println("Your grade is A");
    }



    }

}
