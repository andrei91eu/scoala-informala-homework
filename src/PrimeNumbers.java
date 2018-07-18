import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = keyboard.nextInt();

        int i=0;
        System.out.print("Prime numbers: ");

        //Take all the numbers smaller than the number I entered
        while(i < number) {
            boolean prime = true;

            //Algorithm for checking if a number is prime;
            for(int j = 2; j <= i/2; j++){
                int rest = i % j;

                if (rest == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime) {
                System.out.print(i + ", ");
            }

            i++;
        }
    }
}
