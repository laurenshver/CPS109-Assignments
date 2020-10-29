package Assignments109;

public class StudentData {

    //instance variables

    String firstName;
    String lastName;
    int age;
    int id;
    double scores;

    //state of a variable is its value
    //methods
    void setFirstName(String n) {
        firstName = n;
    }

    void setlastName(String l) {
        lastName = l;
    }

    void setAge(int a) {
        age = a;
    }

    void setId(int i) {
        id = i;
    }

    void setScores(double s) {
        scores = s;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getAge() {
        return age;
    }

    int getId() {
        return id;
    }

    double getScores() {
        return scores;
    }

    public StudentData(String firstName, String lastName, int age, int id, double scores) {
        firstName = firstName;
        lastName = lastName;
        age = age;
        id = id;
        scores = scores;

    }


}
