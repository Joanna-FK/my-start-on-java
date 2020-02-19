package pl.sda.joanna.lesson9;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        //wywołanie metody z obsługą wyjątku przez try catch
        try {
            readData();
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Podales bledne dane, popraw");
        }
        readAge2();
    }

    public static void readAge() throws Exception {
        System.out.println("Może powodować problem");
        throw new Exception("Został wywołany wyjątek");
    }

    public static void readAge2() {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj wiek");
            int age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Błędna wartość, więk nie może być ujemny");
            }
            if
            (age > 0) {
                System.out.println("Twój wiek to " + age);
            }

        } catch (Exception e) {
            System.out.println("Podałeś złą wartość");
        } finally {
            System.out.println("Komunikat kończący");
        }

    }

    public static void readData() throws Exception { //deklarujemy  w metodzie ze bedzie wyrzucać wyjatek

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię ");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko");
        String surname = scanner.nextLine();
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        if (age < 0 || age > 120) {

            throw new Exception("Niepoprawny wiek"); //wyrzucanie wyjątku

        }
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
    }
}
