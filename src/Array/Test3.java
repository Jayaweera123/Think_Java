package Array;

public class Test3 {


    public static int search(double []array, double target){
        for(int i=0; i<array.length; i++){
            if(array[i]== target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String []args){
        double [] discount = {0.05,0.10,0.15,0.20,0.30};
        double target =search(discount, 0.15);
        System.out.println("Disconut :" +target);

    }
}
