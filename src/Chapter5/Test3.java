package Chapter5;

import java.util.Scanner;
public class Test3 {
    public static void main(String [] args){
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter andy number :");
        number=scanner.nextInt();

        if(number%2 ==0) {
            System.out.println("The number is even ");
        }else{
            System.out.println("The number is odd ");

        }

    }
}
