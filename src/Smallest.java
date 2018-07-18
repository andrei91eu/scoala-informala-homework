public class Smallest {

    public static void main(String[] arg) {

        int[] lista = {5, 7, 9, 11, 13, 15, 19, 21};

        int minim = lista[0];

        for (int i = 0 ; i < lista.length ; i++) {
            if (minim > lista[i]) {
                minim = lista[i];
            }
        }

        System.out.println("Minimul este: " + minim);
    }











}

