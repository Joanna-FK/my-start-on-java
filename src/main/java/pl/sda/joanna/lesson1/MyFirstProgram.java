package pl.sda.joanna.lesson1;

import java.util.Scanner;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("robisz co chcesz");
        System.out.println("albo i nie");
        System.out.println("nie wiem");
        String text = "Trzeba coś napisac";
        System.out.println(text);
        Long jeden = 10000000L;
        System.out.println(jeden);
        Double dwa = 10.1234;
        System.out.println(dwa);
        Integer trzy = 10;
        System.out.println(trzy);
        Float cztery = 10.123f;
        System.out.println(cztery);
        Integer a1 = 1;

        Integer a2 = 2;
        Integer a3 = 3;
        Integer a4 = a1 + a2 + a3;
        System.out.println(a4);

        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.println("Iteracja: " + 1);
        }

        int k = 0;
        while (k < 100) {
            k = k + 1;
            System.out.println("Iteracja: " + k);
        }

        for (int a = 0; a < 100; a++) {
            System.out.println("Iteracja: " + a);
        }


        int g = 10;
        if (g++ == 10) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

        int j = 1000;
        int y = 0;
        while (j < 2000) {
            j = j + 70 + (j * 2 / 100);
            System.out.println("populacja: " + j);
            System.out.println("ile lat" + y++);

        }
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println(first);

        Scanner scany = new Scanner(System.in);
        String firstName = scany.nextLine();
        System.out.println(firstName);

        Scanner scan2 = new Scanner(System.in);
        String firstName2 = scan2.nextLine();
        System.out.println(firstName2);

        Scanner liczba = new Scanner(System.in);
        int pierwszy = liczba.nextInt();
        System.out.println(pierwszy % 6 + 2);

        Scanner liczba2 = new Scanner(System.in);
        int one = liczba2.nextInt();
        int two = liczba2.nextInt();
        if (one > two) {
            System.out.println("jeden jest większe od dwa");
        } else {
            System.out.println("jeden jest mniejsze od dwa");
        }

        Scanner number = new Scanner(System.in);
        int jeden1 = number.nextInt();
        int dwa2 = number.nextInt();
        int trzy3 = number.nextInt();
        if ((jeden1 > dwa2) && (jeden1 > trzy3)) ;
        System.out.println(jeden1);
        if ((trzy3 < jeden1) && (dwa2 < jeden1)) ;
        System.out.println(jeden1);

        Scanner liczba3 = new Scanner(System.in);
        int jeden3 = liczba.nextInt();
        int dwa3 = liczba3.nextInt();
        int trzy33 = liczba3.nextInt();
        if ((dwa3 > jeden3) && (dwa3 > trzy33)) {
            System.out.println(dwa3);
        }
        if ((trzy33 < dwa3) && (jeden3 < dwa3)) {
            System.out.println(dwa3);
        }
    }
}
