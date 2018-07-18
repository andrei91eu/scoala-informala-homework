import java.util.Scanner;

public class StartFinish {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = keyboard.nextInt();
        System.out.print("Enter finish: ");
        int finish = keyboard.nextInt();

        if (start >= finish) {
            System.out.println("There are no numbers between start and finish.");
            return;
        }

        System.out.print("The numbers are: ");
        for (int i = start; i <= finish; i++) {
            System.out.print(i + ", ");
        }
    }
}
