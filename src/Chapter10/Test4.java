package Chapter10;
import java.awt.Point;
import java.awt.Rectangle;

public class Test4 {
    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x,y);
    }

    public static void main(String []args){
        Rectangle box = new Rectangle(0,0,100,200);

        Point center = findCenter(box);
        System.out.println("Center of the Rectangle is :" +center);
    }

}
