package Time0519;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter value in seconds: ");
        int seconds =scanner.nextInt();

        Time time = new Time(seconds);

        System.out.println("Formatted time is :" +time.toString());


    }
}
