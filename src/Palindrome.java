import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = keyboard.nextInt();

        // Transform number into string
        String numberAsString = String.valueOf(number);

        // Get list of characters from string
        char[] chars = numberAsString.toCharArray();

        int start = 0;
        int end = chars.length - 1;
        while (end > start) {
            //Check if characters are the same
            if (chars[start] != chars[end]) {
                System.out.println("Number is not a palindrome.");
                return;
            }
            ++start;
            --end;
        }

        System.out.println("Number is a palindrome.");
    }
}
