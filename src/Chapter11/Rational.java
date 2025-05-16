package Chapter11;

public class Rational {
    private int numerator;
    private int denominator;

    // No-argument constructor: sets numerator=0, denominator=1
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructor with two arguments to initialize numerator and denominator
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Instance method to print the rational number
    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }

    // toString method for printing using println
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Modifier method to negate the rational number (change sign)
    public void negate() {
        numerator = -numerator;
    }

    // Modifier method to invert the rational number (swap numerator and denominator)
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    // Main method to test the Rational class
    public static void main(String[] args) {
        Rational r = new Rational();  // default constructor
        r.printRational();             // prints 0/1

        Rational r2 = new Rational(7, 3);  // parameterized constructor
        System.out.println(r2);              // prints 7/3 using toString()

        r2.negate();            // negate the rational number
        System.out.println("After negate: " + r2);

        r2.invert();            // invert numerator and denominator
        System.out.println("After invert: " + r2);
    }
}
