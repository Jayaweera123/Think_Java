package Chapter5;
import java.util.Scanner;
public class Test2 {

    public static void main(String [] args){
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your age:");
        age=scanner.nextInt();

        if(age > 18) {
            System.out.println("Your are an adult:");
        }
        else{
            System.out.println("Your are  not an adult:");


            }

        }
    }
