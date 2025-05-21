package Time0519;

public class Test {
    public static void main(String []args){
        int [] array = {10,12,15,26,17};
        int sumEven =0;
        int sumOdd =0;


        for(int num: array){
            if(num%2==0){
                sumEven +=num;
                System.out.println("this is even");
            }else{
                sumOdd +=num;
                System.out.println("this is odd");
            }

        }

        System.out.println("Sum of even numbers: " +sumEven);

        System.out.println("sum of odd numbers : " +sumOdd);








    }

}
