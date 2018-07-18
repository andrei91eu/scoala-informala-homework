import java.util.Scanner;

public class Maxim {

    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = keyboard.nextInt();
        int maxim = 0;

        while(number > 0) {
            int digit = number % 10;

            if (maxim < digit) {
                maxim = digit;
            }

            number = number / 10;
        }

        System.out.println("Maxim is: " + maxim);
    }
}
