package Assignments109;

import java.util.ArrayList;
import java.util.Scanner;

public class assign6 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add another class? Yes/No?"); //answers can only be yes or no
        String newclass = sc.nextLine();
        System.out.println("Do you want to add another Student? Yes/No?"); //answers can only be yes or no
        String newstudent = sc.nextLine();
        String coursecode;
        String studentname;
        int newclassgrade = 0;
        int new101 =0 ;
        int new102 = 0;
        int new103 = 0;
        int addedclass = 0;

        ArrayList<String> names = new ArrayList<>();
        names.add("Jonathan");
        names.add("Stenson");                        //Array list for the student names
        names.add("Oliver");
        names.add("Kevin");
        names.add("Robert");
        names.add("McNamara");
        names.add("Westwood");


        ArrayList<Integer> CCPS101 = new ArrayList<>();
        //CCPS101 grades
        CCPS101.add(65);
        CCPS101.add(78);                                      //Array List for CCPS101 grades
        CCPS101.add(75);
        CCPS101.add(88);
        CCPS101.add(67);
        CCPS101.add(70);
        CCPS101.add(63);

        ArrayList<Integer> CCPS102 = new ArrayList<>();
        //CCPS102 grades
        CCPS102.add(73);
        CCPS102.add(84);                        // Array List for CCPS102 grades
        CCPS102.add(69);
        CCPS102.add(71);
        CCPS102.add(74);
        CCPS102.add(82);
        CCPS102.add(81);

        ArrayList<Integer> CCPS103 = new ArrayList<>();
        //CCPS103 grades
        CCPS103.add(55);
        CCPS103.add(64);                    //Array List for CCPS013 grades
        CCPS103.add(57);
        CCPS103.add(67);
        CCPS103.add(69);
        CCPS103.add(70);
        CCPS103.add(73);

        ArrayList <Integer> AddedClass = new ArrayList<>(); //empty Array List for new class



            // Get course code for new class
        switch (newclass.toUpperCase()){
            case "YES":
                System.out.println("Enter new course code:");
                coursecode= sc.nextLine();
                System.out.println("Enter course grades. To Stop, enter 1001.");
                while (true){
                    newclassgrade = sc.nextInt();
                    if (newclassgrade == 1001)
                        break;
                    AddedClass.add(newclassgrade);
                }
                break;
            default:
                coursecode = null;
                break;
        }

        // giving new student a name and inputting grades for CCPS101,102,103 and the new class if it's been created
        switch (newstudent.toUpperCase()) {
            case "YES":
                System.out.println("Enter Student Name:");
                studentname = sc.next();
                System.out.println("Enter " + studentname + "'s grade for CCPS101: ");
                new101 = sc.nextInt();
                System.out.println("Enter " + studentname + "'s grade for CCPS102: ");
                new102 = sc.nextInt();
                System.out.println("Enter " + studentname + "'s grade for CCPS103:");
                new103 = sc.nextInt();
                if (coursecode != null) {
                    System.out.println("Enter " + studentname + "'s grade for " + coursecode.toUpperCase() + ":");
                    addedclass = sc.nextInt();
                } else {
                    break;
                }
                break;
            default:
                studentname = null;
                break;
        }


        System.out.println(coursecode);
        System.out.println(studentname);

        if (studentname != null){
            names.add(studentname);
        }
        System.out.println(names);

        if (new101 > 0){
            CCPS101.add(new101);
        }
        System.out.println(CCPS101);

        if (new102 > 0){
            CCPS102.add(new102);
        }
        System.out.println(CCPS102);

        if (new103 > 0){
            CCPS103.add(new103);
        }
        System.out.println(CCPS103);

        if (addedclass > 0){
            AddedClass.add(addedclass);
        }
        System.out.println(AddedClass);



    }
}
