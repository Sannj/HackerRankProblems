package hackerrank;

import java.util.Scanner;

/**
 * Created by sanjanabadam on 6/15/16.
 */
public class Inherit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName,id);
        testScores = scores;
    }
    public char  calculate(){
        int sum = 0;
        for(int i=0;i<testScores.length;i++){
            sum+=testScores[i];
        }
        float avg = sum/testScores.length;
        // System.out.print(avg);
        if(avg>=90){
            return 'O';
        }
        else if(80<=avg){
            return 'E';
        }
        else if(avg>=70){
            return 'A';
        }
        else if(avg>=55){
            return 'P';
        }
        else if(avg>=40){
            return 'D';
        }
        else{
            return 'T';
        }
    }

}