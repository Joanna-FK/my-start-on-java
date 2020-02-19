package pl.sda.joanna.lesson2;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {


        Scanner upside2 = new Scanner(System.in);
        String a = upside2.nextLine();
        String a1 = new StringBuilder().append(a).reverse().toString(); //wypisanie wyrazu od końca
        System.out.println(a1);

        Scanner palindrom = new Scanner(System.in);
        String b = palindrom.nextLine();
        String b1 = new StringBuilder().append(a).reverse().toString();
        System.out.println(b1);
        if (b.equals(b1)) {
            System.out.println("to jest palindrom");}
        else {
            System.out.println("to nie jest palindrom");
        }
    }
}
