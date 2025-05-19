package ProblemSolving;
import java.util.Scanner;
public class Sum {
    public static void main(String [] args){
        int a;
        int b;
        int sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 :" );
        a = scanner.nextInt();

        System.out.println("Enter number 2 :" );
        b = scanner.nextInt();

        sum = a+b;
        System.out.println("Sum is :" +sum);

    }
}
