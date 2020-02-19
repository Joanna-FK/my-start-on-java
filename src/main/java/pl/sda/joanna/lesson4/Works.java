package pl.sda.joanna.lesson4;


public class Works {

    public static void main(String[] args) {

        System.out.println(pow(2, 4));
        System.out.println(zadanie1(3, 2));
        System.out.println(multiply(2, 3, 4, 5));
        System.out.println(sumOfDigits(1234));
        flag();
        System.out.println(numbers(4, 9));
        System.out.println(silnia(5));
        System.out.println(times(86399));
        int[] tab = {45, 78, 638, 958, 451, 78};
        printBigerThenHundret(tab);
        int[] a = {45, 8599, 458, 62, 784};
        printOddNumberBiger(a);


        int[] table = {45, 55, 78, 678, 45, 856};
        reversTable(table);

    }

    //Napisać metodę która policzy potege danej liczby całkowitej. Tj. przyjmuje dwa argumenty typu int i zwraca
    // typ long. Nie używać gotowych funkcji w javie.

    public static long pow(int a, int b) {
        long c = 1;
        for (int i = 0; i < b; i++) {
            c = c * a;
        }

        return c;
    }

    public static long zadanie1(int a, int b) {
        long c = 1;
        c = a;
        if (b == 1) {
            return c;
        } else {
            for (int i = b; i != 1; i--) {
                c = c * a;
            }
            return c;
        }
    }

    //   2. Napisać metodę która przyjmuje dowolną liczbę argumentów typu int (skorzystać ze składnie zmiennej
    //   liczny argumetów) i zwróci iloczyn tych liczb.

    public static int multiply(int... a) {
        int result = a[0] * a[1];
        for (int i = 2; i < a.length; i++) {
            result = result * a[i];
        }
        return result;
    }

    //3. Napisać metodę która przyjmuje jedną liczbę (int) i zwraca sume cyr tej liczby.
    public static int sumOfDigits(int a) {
        int b = 0;
        do {
            int c = a % 10; //123/10=3
            b += c; //+3
            a = (a - c) / 10;
        }//12
        while (a != 0);
        return b;
    }
//4. Napisz program, który wyświetli na konsoli amerykańską flagę

    public static void flag() {

        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * * * ==================================\n" +
                    " * * * * *  ==================================");
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }

    //Napisz metodę, który przyjume dwie liczby całkowie, i zwraca true jeśli pierwsza jest większa lub równa od
    // drugiej i false jeśli przeciwnie


    public static boolean numbers(int a, int b) {
        if (a >= b) {
            return true;
        }
        {
            return false;
        }
    }

    //6. Napisać metodę która przyjmuje liczbę całkowitą (int) i zwraca obliczoną silnie tej liczby.

    public static int silnia(int a) {
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        return b;
    }

    //Napisz metodę która przyjmuje liczbę całkowitą (int), która będzie oznaczać liczbę sekund. Metoda ma zwracać
    // string który będzie wskazywał ile to jest godzin minut i sekund.
    public static String times(int time) {

        int hour = time / 3600;
        int minute = (time / 60) % 60;
        int second = minute % 60;
        String h = time + "=" + hour + ":" + minute + ":" + second;
        System.out.println(time + " sekund to jest " + hour + " godzin i " + minute + " minut  i" +
                " " + second + " sekund");
        return h;

    }


    //8. Napisz metodę, która przayjmuje talicę int-ów i nic nie zwraca za to wypisuje na konsoli te liczby z
    // tablicy którę są większe od 100.

    public static void printBigerThenHundret(int[] tab) {

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 100)
                System.out.println(tab[i]);
        }
    }
//Napisz metodę, która przayjmuje talicę int-ów i nic nie zwraca za to wypisuje na konsoli te liczby z tablicy którę
// są większe parzyste.


    public static void printOddNumberBiger(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 10 && a[i] % 2 == 0) { //większe od 10
                System.out.println(a[i]);
            }
        }
    }
// 10. Napisz program, który przjmuje tablicę liczb (int) i zwraca też tablicę, lizcb która jest odwróconą talicę
// tej która przyszła jako argumenty

    public static void reversTable(int[] tab) {
        int tab2first = tab.length - 1;
        int tab2end = 0;

        while (tab2end < tab2first) {
            int a = tab[tab2end];
            tab[tab2end] = tab[tab2first];
            tab[tab2first] = a;
            tab2end++;
            tab2first--;
        }
        int i = 0;
        while (i < tab.length) {
            System.out.print(tab[i] + " ");
            i++;
        }
    }


}

