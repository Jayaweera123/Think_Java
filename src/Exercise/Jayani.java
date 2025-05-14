package Exercise;
import java.util.Scanner;

public class Jayani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] value = new int[10];
        // Input validation loop
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter marks " + (i + 1) + " : ");
                int inputMark = scanner.nextInt();

                if (inputMark >= 1 && inputMark <= 100) {
                    value[i] = inputMark;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a value between 1 and 100.");
                }
            }
        }
        // Display grades
        System.out.println("\nGrades:");
        for (int i = 0; i < 10; i++) {
            int mark = value[i];
            System.out.print("Marks " + (i + 1) + ": " + mark + " → Grade ");

            if (mark >= 75) {
                System.out.println("A");
            } else if (mark >= 65) {
                System.out.println("B");
            } else if (mark >= 55) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }
}
