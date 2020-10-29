package Assignments109;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment7 {


    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter series of numbers. Enter 1111 to exit.");
        int integers;
        while (true) {
            integers = sc.nextInt();
            if (integers == 1111)
                break;
            numbers.add(integers);
        }
        System.out.println("Enter SUM to be tested:");
        int sum = sc.nextInt();
        int count =0;
        int i;
        int k;
        int added;
        for (i = 0; i < numbers.size(); i++) {
            for (k = 1; k < numbers.size(); k++) {
                added = numbers.get(i)+numbers.get(k);
                if (added == sum){
                    System.out.println("(" +numbers.get(i) + "," + numbers.get(k) + ")");
                    count = count +1;
                    break;
                }
            }
            break;
        }
        if (count ==0){
            System.out.println("Sorry, there are no such values.");
        }
        }

    }