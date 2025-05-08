package Solo;
import java.util.Scanner;


public class Test2 {
    public static void main(String [] args){
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("your name is: ");
        name=scanner.nextLine();
        System.out.println("my name is: " +name);


        System.out.print("your age is: ");
        age=scanner.nextInt();
        System.out.print("my age is:" +age);


    }
}
