package pl.sda.joanna.lesson4;

public class RepeatExercises {

    public static void main(String[] args) {

        int[] tab = new int[10];
        System.out.println("Tablica tab ma długość : " + tab.length);
        for (int i = 0; i < 10; i++) {
            System.out.println("Wartość w tablicy przed wpisaniem tab[" + i + "] : " + tab[i]);
        }
        for (int i = 0; i < 10; i++) {
            tab[i] = i + 50;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Wartość w tablicy po wpisaniu tab[" + i + "] : " + tab[i]);
        }


        String[] zakupy = {"jajka", "mleko", "masło", "coś na chleb"};
        System.out.println("Lista zakupów : ");
        for (String produkt : zakupy) {
            System.out.println(" - " + produkt);
        }


        int[][] tablicaMnozenia = new int[10][10];
// Wpisujemy wartości do tablicy
        for (int wiersz = 1; wiersz <= tablicaMnozenia.length; wiersz++) {
            for (int kolumna = 1; kolumna <= tablicaMnozenia.length; kolumna++) {
                tablicaMnozenia[wiersz - 1][kolumna - 1] = wiersz * kolumna;
            }
        }
        System.out.println("Wypisujemy wartości tabliczki mnożenia : ");
        for (int wiersz = 0; wiersz < tablicaMnozenia.length; wiersz++) {
            for (int kolumna = 0; kolumna < tablicaMnozenia.length; kolumna++) {
                System.out.printf("%4d", tablicaMnozenia[wiersz][kolumna]);
            }
            System.out.println("");

        }

        System.out.println("Otrzymane argumenty jeden po drugim : ");
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("Lista argumentow jest pusta...");
        }

    }
}


