package Book0519;

public class Book {
    private String title;
    private String author;
    private int num;

    //Default constructor
    public Book(){
        this.title="Unknown";
        this.author="Unknown";
        this.num=0;
    }

    //value constructor
    public Book(String title, String author, int num){
        this.title=title;
        this.author=author;
        this.num=num;
    }

    public String toString() {
        return "Title:"+title+ ",Author:"+author+ ",Pages:" +num;
    }
}
