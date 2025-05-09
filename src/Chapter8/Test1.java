package Chapter8;

public class Test1 {

    public void display() {
        System.out.println("Helllo");
        display();

    }

    public static void main(String [] args){
        Test1 obj = new Test1();
        obj.display();
    }
}
