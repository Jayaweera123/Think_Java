package ArrayList;

import java.util.ArrayList;

public class Test4 {
    public  static void main(String []args) {
        ArrayList<String> Cities = new ArrayList<String>();

        Cities.add("Gampaha");
        Cities.add("Galle");
        Cities.add("Kandy");
        Cities.add( 0,"Colombo");
        Cities.set(3,"Kurunagala");
        Cities.remove(3);
        Cities.add("Matara");
        Cities.add("Hambantota");
        //Cities.clear();

        System.out.println(Cities.get(0));
        System.out.println(Cities);
        System.out.println(Cities.size());

        for(int i =0; i<Cities.size();i++){
            System.out.println(Cities.get(i));
        }

        for(String i : Cities){
            System.out.println(i);
        }

    }
}
