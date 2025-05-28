package ArrayList;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
public class Test3 {
    public static void main(String []args){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Benz");
        cars.add(0,"Honda");
        //cars.clear();


        System.out.println(cars.getLast());
        System.out.println(cars.size());

    }

}
