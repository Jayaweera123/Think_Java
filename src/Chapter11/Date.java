package Chapter11;

public class Date {
    private int year;
    private int month;
    private int day;

    // Constructor with no parameters - sets a default date
    public Date() {
        this.year = 2000;  // Default year
        this.month = 1;    // Default month (January)
        this.day = 1;      // Default day
    }

    // Constructor with parameters to initialize year, month, day
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Method to display the date nicely
    public void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    // Main method to test the Date class
    public static void main(String[] args) {
        Date birthday = new Date(1995, 12, 15);  // Replace with your birth date
        birthday.printDate();
    }
}
