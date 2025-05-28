package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Test6 {

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(12);
            numbers.add(25);
            numbers.add(32);
            numbers.add(40);
            numbers.add(17);
            numbers.add(20);
            numbers.remove(0);

            Collections.sort(numbers);

            for(int i : numbers){
                System.out.println(i);

        }

        }

}
