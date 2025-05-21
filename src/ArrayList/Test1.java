package ArrayList;
import java.util.ArrayList;
public class Test1 {
    public static void main(String[]args){
        ArrayList<String> fruits =new ArrayList<>();

        //add items
        fruits.add("Mango");
        fruits.add("pineapple");
        fruits.add("apple");
        fruits.add("papaw");

        for(String fruit: fruits){
            System.out.println(fruits);
        }

        fruits.remove("Mango");

        if(fruits.contains("mango")){
            System.out.println("Mango in the list");

        }else{
            System.out.println("mango not in the list");
        }


        System.out.println("Total fruits:" +fruits.size());
    }
}
