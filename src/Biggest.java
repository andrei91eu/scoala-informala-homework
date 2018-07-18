import java.util.Scanner;

public class Biggest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = keyboard.nextInt();

        System.out.print("Enter second number: ");
        int b = keyboard.nextInt();

        System.out.print("Enter third number: ");
        int c = keyboard.nextInt();

        int biggest = a;

        if (biggest < b) {
            biggest = b;
        }

        if (biggest < c) {
            biggest = c;
        }

        System.out.println("The biggest number is: " + biggest);
    }
}
