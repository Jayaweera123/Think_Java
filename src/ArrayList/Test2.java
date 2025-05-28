package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> students = new ArrayList<>();

            // 1. Add students to the list
            students.add("Ravindu");
            students.add("Nadeesha");
            students.add("Sahan");
            students.add("Isuri");

            System.out.println("Initial students: " + students);

            // 2. Remove a student (drop out)
            System.out.print("Enter student name to remove: ");
            String toRemove = scanner.nextLine();
            if (students.remove(toRemove)) {
                System.out.println(toRemove + " has been removed.");
            } else {
                System.out.println(toRemove + " was not found in the list.");
            }

            // 3. Search for a student
            System.out.print("Enter student name to search: ");
            String searchName = scanner.nextLine();
            if (students.contains(searchName)) {
                System.out.println(searchName + " is present in the class.");
            } else {
                System.out.println(searchName + " is NOT present in the class.");
            }

            // 4. Display current student list
            System.out.println("Current students in the class: ");
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
    }

