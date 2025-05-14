package Exercise;
import java.util.Scanner;

public class Manusha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number >= 100 && number <= 1000) {
                if (number % 100 == 0) {
                    System.out.println("yes!");
                    flag = false;
                }
            }
        }

    }
}
