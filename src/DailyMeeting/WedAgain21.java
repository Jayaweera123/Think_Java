package DailyMeeting;
import java.util.ArrayList;

public class WedAgain21 {

    public static void getOutput() {
        int[] arr = {11, 12, 15, 20, 17, 18, 21, 11, 16, 24};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] % 2 != 0) {
                list.add(arr[i]);
            }
        }
        System.out.println("Odd numbers in even index: " + list);
    }

    public static void main(String[] args) {
        getOutput();  // This calls the method
    }
}

class TestCall {
    public static void main(String[] args) {
        // Call the static method from WedAgain21
        WedAgain21 wedAgain21 = new WedAgain21();
        
        WedAgain21.getOutput();
    }
}
