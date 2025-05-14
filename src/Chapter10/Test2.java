package Chapter10;
import java.awt.Point;

public class Test2 {
    public static void main(String [] args){
        Point blank = new Point(5,6);

        System.out.println("x :" +blank.x);
        System.out.println("y :" +blank.y);

        int distanceSquared = blank.x* blank.x* blank.x + blank.y* blank.y;
        System.out.println("Distance is :" +distanceSquared);



    }
}
