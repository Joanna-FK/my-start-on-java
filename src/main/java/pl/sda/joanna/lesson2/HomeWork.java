package pl.sda.joanna.lesson2;

public class HomeWork {
    public static void main(String[] args) {
        nieparzyste();
        liczby();
        liczby2();
        tablica2D(4);
        przekatna1(4);
        przekatna2(4);
        upside("żółw");
        System.out.println(upside("żółw"));

        System.out.println(palindrom("kajak"));

        System.out.println(multiply(2, 3, 4));
        int a = 34;
        System.out.println(sumOfDigits(a));
        times();
        System.out.println();
        numbers(); //parzyste
        numbers2(); //>100


        int aa = 13;
        boolean b = numbersFirst(aa);
        System.out.println(b);


        int[] tab = {3, 6, 88, 90, 567};
        if (tab.length == 0) {
            System.out.println(-1);
        } else {
            System.out.println(maxInArray(tab));
        }

        System.out.println(multiply(2, 3, 4));
    }


    public static void nieparzyste() {

        for (int i = 1; i < 40; i++) {
            System.out.println(i++);
        }

        int i = 1;
        while (i < 40) {
            System.out.println(i++);
            i++;
        }
    }


//1.Napisać metodę statyczną (w tej samej klasie co metoda main) która nie przyjmuje żadych argumentów i zwraca void
// i która wypisuje 20 kolejnych liczb od 0

    public static void liczby() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }

    //zadanie 3
//apisać metodę która robi dokładnie to samo co w zadaniu pierwszy ale użyć pętli for w ten sposób, że licznik
// zaczyna się od 15, i po każdym przebiegu pętli jest zwiększany o 3

    public static void liczby2() {

        for (int i = 15; i < 35; i += 3) {
            System.out.println(i);
        }
    }


    //zadanie 4
    //Napisać metodę statyczną (w tej samej klasie co metoda main) która przyjmuje argument w postaci liczby całkowitej
    // 'n' a następne tworzy tablicę dwuwymiarąwą
    //n x n po czym wypełnia całą wartościami 3 i wypisuje na ekran. Metoda kończąc działanie nie zwraca żadnego wyniku.

    public static void tablica2D(int n) {
        int[][] tablica2D = new int[n][n];

        for (int i = 0; i < tablica2D.length; i++) {
            for (int j = 0; j < tablica2D[i].length; j++) {
                tablica2D[i][j] = 3;
                System.out.print(tablica2D[i][j] + " ");
            }
            System.out.println();

        }
    }

    //zadanie 5
// napisać metodę statyczną (w tej samej klasie co metoda main) która przyjmuje argument w postaci liczby całkowitej
// 'n' a następne tworzy tablicę dwuwymiarąwą
//n na n po czym wypełnia całą oprócz przekątnej wartościami 0 a przekątną 1. Metoda kończąc działanie nie zwraca żadnego wyniku.
    public static void przekatna1(int n) {
        int[][] przekatna = new int[n][n];

        for (int i = 0; i < przekatna.length; i++) {
            for (int j = 0; j < przekatna[i].length; j++) {
                if (i == j) przekatna[i][j] = 1;
                else przekatna[i][j] = 0;
                System.out.print(przekatna[i][j] + " ");
            }
            System.out.println();

        }
    }
//7. Napisać metodę statyczną (w tej samej klasie co metoda main) która przyjmuje argument w postaci liczby całkowitej
// 'n' a następne tworzy tablicę dwuwymiarąwą
//   n x n po czym wypełnia całą oprócz "drugiej" przekątnej wartościami 0 a "drugą" przekątną 1.
//   Metoda kończąc działanie nie zwraca żadnego wyniku.


    public static void przekatna2(int n) {
        int[][] przekatna2 = new int[n][n];

        for (int i = 0; i < przekatna2.length; i++) {
            for (int j = 0; j < przekatna2[i].length; j++) {

                przekatna2[i][j] = 0;

                System.out.print(przekatna2[i][j] + " ");
            }

            System.out.println();
        }
    }

    //9. Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.

    public static String upside(String a) {
        String a1 = new StringBuilder().append(a).reverse().toString();
        {
            return a1;
        }
    }
//Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem. Np. “kajak” jest palindromem
// (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie.

    public static String palindrom(String a) {
        String a1 = new StringBuilder().append(a).reverse().toString();
        System.out.println(a1);
        if (a.equals(a1)) {
            System.out.println("to jest palindrom");
        } else {
            System.out.println("to nie jest palindrom");
        }
        {
            return a1;
        }
    }

    //Napisać metodę która przyjmuje dowolną liczbę argumentów typu int (skorzystać ze składnie zmiennej liczny argumetów) i zwróci iloczyn tych liczb.

    public static int multiply(int... a) {
        int result = a[0] * a[1];

        int i = 2;
        while (i < a.length) {
            result = result * a[i];
            i++;

        }
        return result;
    }

    // Napisać metodę która przyjmuje jedną liczbę (int) i zwraca sume cyr tej liczby.

    public static int sumOfDigits(int a) {
        int b = 0; //suma cyfr

        do {
            int c = a % 10; //cyfra która jest resztą z dzielenia liczby przez 10 (4)
            b += c; // +4
            a = (a - c) / 10; // (34-4)/10=3
        }
        while (a != 0);
        return b; //3+4
    }

    //  Napisz metodę która przyjmuje liczbę całkowitą (int), która będzie oznaczać liczbę sekund.
    //  Metoda ma zwracać string który będzie wskazywał ile to jest godzin minut i sekund.
//????
    public static void times() {
        int time = 0;
        int hour = time / 60;
        int minute = (time / 60) % 60;
        int secunda = minute % 60;
        String text = Integer.toString(hour);
        Integer.toString(minute);
        Integer.toString(secunda);
        System.out.println(text);
    }

    // 8. Napisz metodę, która przayjmuje talicę int-ów i nic nie zwraca za to wypisuje na konsoli te liczby
    // z tablicy którę są większe od 100.

    public static void numbers2() {

        int[] b = {45, 67, 80, 690, 346, 101, 100};
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 100)
                System.out.println(b[i]);
        }

    }

    //9 Napisz metodę, która przayjmuje talicę int-ów i nic nie zwraca za to wypisuje na konsoli te liczby z tablicy
    // którę są większe parzyste.
    public static void numbers() {

        int[] a = {56, 99, 115, 456, 789, 456, 4, 77, 26};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] > 10) // np większe od 10
                System.out.println(a[i]);
        }
    }


    //4. Napisz metodę, która tablicę int-ów i zwraca int - który jest największy w tej tablicy lub -1 jeśli tablica jest pusta
    public static int maxInArray(int[] tab) {
        int max = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }


//9. Napisz metodę która przyjmuje jako argument liczbę całkowitą (int) i zwraca true jeśli podana liczba jest
// pierwsza lub false w przeciwnym wypadku

    public static boolean numbersFirst(int a) {

        if (a < 2)
            return false; //liczba pierwsza jest większa od 2
        for (int i = 2; i * i <= a; i++)
            if (a % i == 0) //jeżeli się dzieli przez coś wiecej nić siębie i 1 to nie jest pierwsza
                return false;

        return true;
    }


//zadanie 4 flaga

       /* for (int i = 0; i < 4; i++) {
            System.out.println("* * * * * * ==================================\n * * * * *  ==================================");
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }*/



        /*String[] napisy = new String[5];
        napisy[0] = "kot";
        napisy[1] = "Bimber";
        napisy[2] = "Wodka";
        napisy[3] = "Whisky";
        napisy[4] = "Piwo";
        System.out.println(napisy[3]);*/

        /*int[] liczby = new int[100];
        int i = 0;
        while (i < liczby.length) {
            liczby[i] = 10;
            System.out.println(liczby[i]);i++;
        }*/



        /*int[] liczby = new int[100];
        for (int j = 0; j < liczby.length; j++) {
            liczby[j] = 10;
            System.out.println(liczby[j]);
        }*/
//zadanie1

// potege danej liczby całkowitej. Tj. przyjmuje dwa argumenty typu int i zwraca typ long

        /*int a = 3;
        int b = 10;
        long c = (long) Math.pow(a,b);

        System.out.println(a + " "+"do"+" "+"potęgi"+" " + b +"" );
        System.out.println(c);*/

//4. Napisz program, który wyświetli na konsoli amerykańską flagę

       /* System.out.println("*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println( " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " "+"=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println("*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println(" " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" +" "+ "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println("*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println( " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " "+"=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println("*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println(" " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" +" "+ "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println("*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + " " + "*" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=" + "=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
        System.out.println("="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"="+"=");
   */


//zadanie5
// napisz metodę, który przyjume dwie liczby całkowie, i zwraca true jeśli pierwsza jest większa lub równa od drugiej
// i false jeśli przeciwnie

        /*int a = 15;
        int b = 13;
        int c= 15;
        System.out.println(a>b);
        System.out.println(a<=c);
        System.out.println(a<b);}*/


//flaga

        /*String a = "* * * * * * ==================================\n * * * * *  ==================================";
        String b = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(a);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(b);
        }*/


}

