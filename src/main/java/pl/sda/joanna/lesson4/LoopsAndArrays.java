package pl.sda.joanna.lesson4;

import java.util.Arrays;

public class LoopsAndArrays {

    public static void main(String[] args) {

         float [] numbers =  {3.45f, 45.45f, 15.45f };
        System.out.println( averageOfNumber(numbers));

        int[] tab  = {3,6,89,46, 25};
         int a = 13;
        System.out.println(doesArrayContainsValue(tab,a));

        int[] table ={15,45,2,89};
        int b = 15;
        System.out.println(getIndeks(table, b));
        int[] tab1 = {1,45,87,658};
        if (tab1.length == 0)
            System.out.println(-1);
            else
            System.out.println(maxInArray(tab1));

    /*String [] table = {"aaa, bbb, ccc, ddd"};
     String []tab2 = reverseTabOfStrings(table);
        System.out.println(Arrays.toString(tab2));*/

        int [] table1= {15,45,8,69,789,7,0,78};
        printHalfTable(table1);

      int [] tablica1 = {1,2,3};
        int [] tablica2 = {4,5,75};
        int [] sum = sumOfTable(tablica1,tablica2);
        int [] zero = {};
        System.out.println(Arrays.toString(sumOfTable(tablica1, tablica2)));

       int[] d = {1, 2, 5};
        int[] e = {1,2,5};
        System.out.println(sumOfTables(d, e));

       int g = 211;
        System.out.println(primeNumbers(g));


    }

    // 1. Napisz metodę która przyjmuje tablicę float-ów i zwraca float który jest średnią wszystkich wartości w tablicy.

    public static float averageOfNumber(float[] numbers) {
        float avarage = 0;
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            float number = numbers[i];
            sum += number;
            avarage = sum / numbers.length;
        }
        return avarage;
    }
//2. Napisz metodę, która przyjmuje dwa argumenty, pierwszy to tablica int-ów, drugi to pojedyńczy int. Metoda zwraca
// true jeśli drugi argument znajduje się w  podanej tablicy lub false w przeciwnym przypadku

    public static boolean doesArrayContainsValue(int[] tab, int a) {
        for (int i = 0; i < tab.length; i++) {
            if (a == tab[i]) return true;
        }
        return false;
    }

//3. Napisz metodę, która przyjmuje dwa argumenty, pierwszy to tablica int-ów, drugi to pojedyńczy int. Metoda zwraca
// int który jest indeksem wartości podanej jako argument drugi jeśli ten argument istnieje w tablicy
// lub -1 w przeciwnym przypadku.

    public static int getIndeks(int[] table, int a) {

        for (int i = 0; i < table.length; i++) {
            if (a == table[i])
                return i;
        }
        return -1;
    }
//4. Napisz metodę, która tablicę int-ów i zwraca int - który jest największy w tej tablicy lub -1 jeśli tablica
// jest pusta

    public static int maxInArray(int[] tab) {
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        return max;
    }
    //5. Napisz metodę, która przyjmuje tablicę String-ów i tworzy nową tablicę Strintów, która jest odwróconą pierwszą
    // ????

    public static String[] reverseTabOfStrings(String[] table) {
        String[] tab2 = new String[table.length];
        for (int i = table.length - 1; i <= table.length; i++) {
            table = tab2;
        }
        return tab2;
    }

//6. Napisz metodę która przyjmuje tablicę int-ów i nic nie zwraca za to wyświetla na ekranie co drugi element tablicy
    public static void printHalfTable(int[] table) {

        for (int i = 1; i < table.length; i += 2) {
            System.out.println(table[i]);
        }
    }
//7. Napisz metodę, która dwie tablice intów  jeśli tablice są różnej długości to metoda zwraca pustą tablicę a
// jeśli tej samej długości to zwracamy tablicę która jest
//która zawiera sumy elementów na poszczególnych pozycjach

    // ???
    public static int[] sumOfTable(int[] tab1, int[] tab2) {
        int[] sum = new int[tab1.length];
        int[] zero = {};

        for (int i = 0; i < tab1.length; i++) {
            for (i = 0; i < tab2.length; i++)
                sum[i] = tab1[i] + tab2[i];
            if (tab1.length == tab2.length) {
                return sum;
            }
        }
        return zero; //??
    }

//8. Napisz metodę, która przyjmuje dwie tablicy intów i zwraca true jeśli obie tablice są tej samej długości i mają
// takie same wartoście lub false w przeciwnym wypadku.

    public static boolean sumOfTables(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a.length == b.length && a[i] == b[j]) {
                    return true;
                }
            }
        }
        return false;
    }
//9. Napisz metodę która przyjmuje jako argument liczbę całkowitą (int) i zwraca true jeśli podana liczba jest
// pierwsza lub false w przeciwnym wypadku

    public static boolean primeNumbers(int a) {
        if (a < 2) return false;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

}

