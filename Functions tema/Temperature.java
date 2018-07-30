package temperature;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu temperatura");
        double x = scanner.nextDouble();
        double tcelsius = convertFtoC(x);
        System.out.println("Your body temperature in Celsius degrees is:");
        System.out.println(tcelsius);

        if (tcelsius > 37){
            System.out.println("You are Ill");
    }

}

    private static double convertFtoC (double a){

        return ((a - 32) / 1.8);

    }


}
