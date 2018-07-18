import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter square side: ");
        int number = keyboard.nextInt();

        if (number < 0) {
            System.out.println("Number must be greater than 0.");
            return;
        }

        System.out.println("Area: "+ number * number);
    }
}
