package Chapter5;
import java.util.Scanner;
public class Test4 {
    public static void main(String [] args){
        int marks;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        marks=scanner.nextInt();

        if(marks>0 && marks<=35){
            System.out.println("You have S pass");
        }
        if(marks>35 && marks<=55){
            System.out.println("You have C pass");
        }
        if(marks>55 && marks<=65) {
            System.out.println("You have B pass");
        }
        if(marks>75 && marks<=100) {
            System.out.println("You have A pass");
        }
        else {
            System.out.println("You not have a pass");
        }
}
}
