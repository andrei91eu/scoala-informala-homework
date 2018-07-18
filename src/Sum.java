public class Sum {
    public static void main(String[] arg) {
        System.out.println("Suma");

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        System.out.println("Suma numerelor: " + sum);
    }
}
