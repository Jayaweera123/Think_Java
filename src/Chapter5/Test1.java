package Chapter5;
import java.util.Scanner;
public class Test1 {
    public static void main(String [] args){
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number:");
        number=scanner.nextInt();

    

        if ( number<0 ) {
            System.out.println("The number is negative.");
        }

    }
}
