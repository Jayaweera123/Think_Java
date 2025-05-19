package Array;

public class Test1 {
    public static void main(String [] args){
        int [] numbers ={12,21,45,48,56} ;

        System.out.println("Array elements:");
        for(int i=0; i< numbers.length; i++){
            System.out.println("element index -" +i+ ":"  +numbers[i]);
        }
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        System.out.println("Sum of Array is :" +sum);

    }
}
