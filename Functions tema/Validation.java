package validation;

import java.util.Scanner;

public class Validation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ora");
        int ora = scanner.nextInt();
        System.out.println("Minut");
        int minut = scanner.nextInt();


        boolean oravalida = validateHour(ora);

        boolean minutvalid = validateMinute(minut);

        if (oravalida == false || minutvalid == false) {
            System.out.println("Incorrect Time!");
        } else {
            System.out.println("The time is " + ora + ":" + minut + " now");
        }
    }

    private static boolean validateHour(int a) {
        if (a < 24 && a >= 0) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean validateMinute(int a) {
        if (a < 60 && a>= 0) {
            return true;
        } else {
            return false;
        }
    }

}
