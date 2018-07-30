package max;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Valoarea lui X");
        int x = scanner.nextInt();
        System.out.println("Valoarea lui Y");
        int y = scanner.nextInt();
        System.out.println("Valoarea lui Z");
        int z = scanner.nextInt();


        int max = getMax(x, y);
        max = getMax(max, z);
        System.out.println("Valoarea cea mai mare");
        System.out.println(max);
    }

    private static int getMax(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


}
