package DailyMeeting;

import java.util.ArrayList;

public class Wed21 {

    public static void getOutput( ) {
        int[] arr = {11,12,15,20,17,18,21,11,16,24};
        ArrayList<Integer> list= new ArrayList<>();
        for(int i =0; i<arr.length;i++){
            if(i%2==0 && arr[i]%2!=0){
                list.add(arr[i]);
            }
        }
        System.out.println("Odd numbers in even index:" +list);
    }


}
/*
class New{

    public static void main(String[] args) {
        {/*Wed21 wed21 = new Wed21();

        int[] arr = {11,12,15,20,17,18,21,11,16,24};

        int[] outArr = wed21.}

    }


}
*/