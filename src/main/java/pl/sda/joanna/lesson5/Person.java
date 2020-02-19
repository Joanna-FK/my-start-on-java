package pl.sda.joanna.lesson5;

import java.util.Scanner;

public class Person {
    String name;
    String surname;
    int age;
    protected Sex sex;

    public Person() {
    }

    public void loadData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj imie");
        this.name = scanner.nextLine();
        System.out.println("podaj nazwisko");
        this.surname = scanner.nextLine();
        System.out.println("podaj wiek");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("podaj plec");
        String sexAsString = scanner.nextLine(); //dodanie zmiennej typu String
        if ("M".equals(sexAsString)) {
            sex = Sex.MALE;
        } else if ("K".equals(sexAsString)) {
            sex = Sex.FEMALE;
        }
        if ("MALE".equals(sexAsString) || "FEMALE".equals(sexAsString))
            this.sex = Sex.valueOf(sexAsString);   //zamiana typu Sex na String

    }

}

