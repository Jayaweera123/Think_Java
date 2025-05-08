package Chapter6;

public class Test2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        for(x=1;x<=5;x++) {
            for (y=1;y<=5;y++){
                System.out.printf("%6d", x*y);
            }
            System.out.println();
            }
        }
}
