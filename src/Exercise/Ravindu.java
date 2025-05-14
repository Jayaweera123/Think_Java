package Exercise;
import java.util.Scanner;
public class Ravindu {
    public static void main(String[] args) {
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        word = scanner.nextLine();
        boolean hasVowel = false;

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                hasVowel = true;
                break;
            }
        }if (hasVowel) {
            System.out.println("Contain vowel letters");
        } else {
            System.out.println("Does not contain any vowels");
        }
    }
}
