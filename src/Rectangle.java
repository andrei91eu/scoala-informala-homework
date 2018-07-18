import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = keyboard.nextInt();

        System.out.print("Enter width: ");
        int width = keyboard.nextInt();

        int p = 2 * length + 2 * width;
        System.out.println("Perimeter: " + p);

        int a = length * width;
        System.out.println("Area: " + a);
    }
}
