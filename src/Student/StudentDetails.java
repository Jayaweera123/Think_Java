package Student;

import java.util.Scanner;

public class StudentDetails {

    private Student[] students;  // Array to hold Student objects

    // Method to get input and create Student objects
    public void getStudentData(int count) {
        Scanner in = new Scanner(System.in);
        students = new Student[count];  // initialize array to hold Student objects

        for(int i = 0; i < count; i++) {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            int value = in.nextInt();
            students[i] = new Student(value);  // create Student object with mark
        }
    }

    // Method to display results of all students
    public void showResults() {
        for(int i = 0; i < students.length; i++) {
            students[i].displayResult(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of students: ");
        int num = scanner.nextInt();

        StudentDetails details = new StudentDetails();

        details.getStudentData(num);  // Get marks and create Student objects

        details.showResults();        // Display pass/fail results
    }
}
