package Array;
import java.util.Scanner;
public class Test2{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values to array:");
        int size = scanner.nextInt();
        int [] array = new int[size];

        for(int i =0;i<size;i++){
            System.out.println("Element" +(i+1)+ "  :");//show elemets
            array [i] = scanner.nextInt();// store values in array
        }

        int sum =0;
        int max = 0;
        for(int number : array ){
           sum += number;
        }
        System.out.println("Array totoal valu is :" +sum);


        for(int i=0; i<size; i++){
            if (array[i]>max){
                max= array[i];

            }


        }
        System.out.println("the highest value of array is : " +max);


    }

}

