package Chapter8;
import java.util.Scanner;
public class Test4 {

    public int example(int n){
        if(n==1){
            return n;
        }else{
            return n + example(n-1);
        }

    }

    public static void main(String[] args){
        int n;
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=number.nextInt();
        Test4 obj =new Test4();
        int result = obj.example(n);

        System.out.print("Answer is : " +result);

    }
}
