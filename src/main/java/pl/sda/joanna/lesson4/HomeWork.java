package pl.sda.joanna.lesson4;


public class HomeWork {
    public static void main(String[] args) {
        printNumbers20();
        print20numbers();

        odd20numbers();
        odd20numbers2();
        oddnumbers();

        printNumbers();

        table(4);

        table2(4);
        tableDiagonal(4);

        String a = "kotek";
        System.out.println(reversString(a));

        String b = "domek";
        System.out.println(reverse2(b));

        int aa = 123;
        System.out.println(reversNumber(aa));

        String a1 = "kobyła ma mały bok";
        palindrom(a1);

       /* Scanner palindrom = new Scanner(System.in);
        String b = palindrom.nextLine();

        String b1 = new StringBuilder().append(b).reverse().toString();

        if(b.replaceAll(" ","").equals(b1.replaceAll(" ",""))){
             System.out.println("to jest palindrom");}

        else {
            System.out.println("to nie jest palindrom");
    }*/


    }

    //Napisać metodę statyczną (w tej samej klasie co metoda main) która nie przyjmuje żadych argumentów i zwraca void
    // i która wypisuje 20 kolejnych liczb od 0
//a) za pomocą pętli for
    public static void printNumbers20() {

        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

    }


    //  b) za pomocą pętli while
    public static void print20numbers() {
        int i = 0;

        while (i < 20) {
            i++;
            System.out.println(i);
        }
    }

    //Napisać metodę statyczną (w tej samej klasie co metoda main) która nie przyjmuje żadych argumentów i zwraca void
    // i która wypisuje kolejnych liczb nieparzystych
//a) za pomocą pętli for
    public static void odd20numbers() {

        for (int i = 1; i < 40; i += 2) {

            System.out.println(i);

        }
    }

    public static void oddnumbers() {
        int oddNumber = 1;
        for (int i = 0; i < 20; i++) {
            System.out.println(oddNumber);
            oddNumber += 2;

        }
    }

    //za pomocą pętli while
    public static void odd20numbers2() {

        int i = -1;
        while (i <= 38) {
            i += 2;
            System.out.println(i);
        }
    }

    //3. Napisać metodę która robi dokładnie to samo co w zadaniu pierwszy ale użyć pętli for w ten sposób, że
    // licznik zaczyna się od 15, i po każdym przebiegu pętli jest zwiększany o 3

    public static void printNumbers() {

        for (int i = 15; i < 40; i += 3) {
            System.out.println(i);

        }
    }
//Napisać metodę statyczną (w tej samej klasie co metoda main) która przyjmuje argument w postaci liczby całkowitej 'n'
// a następne tworzy tablicę dwuwymiarąwą
//   n x n po czym wypełnia całą wartościami 3 i wypisuje na ekran. Metoda kończąc działanie nie zwraca żadnego wyniku.

    public static void table(int n) {
        int[][] tab = new int[n][n];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = 3;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();

        }

    }


    public static void table2(int n) {

        int[][] tab2 = new int[n][n];

        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if (i == j) tab2[i][j] = 1;
                else tab2[i][j] = 0;

                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }

    }
    // odwrotna przekątna

    public static void tableDiagonal(int n) {
        int[][] tab = new int[n][n];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[0][n - 1] = 1;
                tab[n - 1][0] = 1;
                tab[n - 2][1] = 1;
                tab[1][n - 2] = 1;

                System.out.print(tab[i][j]);
            }
            System.out.println();
        }

    }
    //9. Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument.

    public static String reversString(String a) {
        String a1 = new StringBuilder().append(a).reverse().toString();
        {
            return a1;
        }
    }

    public static String reverse2(String b) {

        String b1 = String.valueOf(new char[b.charAt(b.length() - 1)]);

        for (int i = b.length() - 1; i >= 0; i--) {
            System.out.print(b.charAt(i));
        }
        return b1;
    }

    //11. Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry
    // (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),

    public static int reversNumber(int a) {
        int a1 = 1;
        for (int i = a % 10; i > 1; i--) {
            System.out.println(i);
        }
        return a1;
    }

    //   12. Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem.
    //   Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie.
    //   Może przydać Ci się metoda String#toCharArray

    public static void palindrom(String a) {
        a = a.replaceAll(" ", "");
        String a1 = new StringBuilder().append(a).reverse().toString();
        a1 = a1.replaceAll(" ", "");

        if (a.equals(a1)) {
            System.out.println("To jest palindrom");
        } else {
            System.out.println("to nie jest palindrom");
        }
    }

}


