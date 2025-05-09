
package Chapter8;
import java.util.Scanner;
//Here accroding to the user inputs all input values calculate using for loop
public class Test3 {
    public static void main(String [] args){
        int n;
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a number :");
        n=number.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++) {
            sum +=i;
        }

        System.out.println("Total value  is  : " +sum);

    }

}
