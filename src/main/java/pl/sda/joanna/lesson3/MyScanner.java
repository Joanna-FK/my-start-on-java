package pl.sda.joanna.lesson3;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
        Scanner napis = new Scanner(System.in); //zczytać z konsoli zdanie
        String jeden = napis.nextLine();
        String drugi = napis.nextLine();

        System.out.println(jeden.length()); //wypisac długść
        System.out.println(jeden.substring(0, jeden.length() / 2)); //połowa wyrazu
        System.out.println(jeden.toUpperCase()); //dużymi literami
        System.out.println(jeden.toLowerCase()); //małymi literami
        System.out.println(jeden.replaceAll(" ", ".")); //zamiana spacji na kropki

        //zczytać jeszcze jeden napis i porównać z tym pierwszym. jak będa takie same to wypisac ze sa takie same

        if (drugi.equals(jeden)) {
            System.out.println("jeden jest taki sam jak drugi");
        } else {
            System.out.println("jeden jest inny niż drugi");
        }

//zczytać jakś liczbę z konsooli, użyć switch i wypisać coś (instrukcja switch-case)

        Scanner scan = new Scanner(System.in);
        int kod = scan.nextInt();
        switch (kod) {
            case 80:
                System.out.println("napisz coś tam");
                break;
            case 120:
                System.out.println("może być coś innego");
                break;
            case 200:
                System.out.println("albo jeszcze coś innego");
                break;
            default:
                System.out.println("to już jest koniec");
        }
    }
}


