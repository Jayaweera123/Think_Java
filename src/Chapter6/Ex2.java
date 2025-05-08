package Chapter6;

public class Ex2 {

    public static double squareRoot(double a) {
            if (a < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }

            double guess = a / 2.0;
            double nextGuess;

            while (true) {
                nextGuess = (guess + a / guess) / 2.0;

                if (Math.abs(nextGuess - guess) < 0.0001) {
                    break;
                }

                guess = nextGuess;
            }

            return nextGuess;
        }

        public static void main(String[] args) {
            double number = 9;
            double result = squareRoot(number);
            System.out.printf("Approximate square root of %.2f is %.5f\n", number, result);
        }
    }


