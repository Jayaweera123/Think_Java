package Book0519;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book title:" );
        String title =scanner.nextLine();

        System.out.println("Enter book Author:" );
        String author =scanner.nextLine();

        System.out.println("Enter number of pages:" );
        int num = scanner.nextInt();

        Book book = new Book(title,author,num);

        System.out.println("Book detail is:" +book.toString() );

    }
}
