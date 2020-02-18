package pl.sda.joanna.christmastree;


public class ChristmasTree {

    public static void main(String[] args) {

        Choinka(10);
        printChristmasTree();
        printChristmasTree2(15);
        christmas(6);

    }

    public static void Choinka(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void printChristmasTree() {
        stars(1); //rysowanie choinki, wywołanie metody stars
        stars(2);
        stars(3);
        stars(4);
        stars(5);
    }

    public static void stars(int a) {

        for (int i = 0; i < a; i++) { //pętla i wykonuje sią a razy, aż dojdzie do a
            System.out.print("*");
        }
        System.out.println();
    }

//rysowanie choinki, wykorzystanie własnej metody dla rysowania gwiazdki

    public static void printChristmasTree2(int christmasTreeHight) {//pętla w metodzie, robi się pętla w pętli
        for (int k = 1; k <= christmasTreeHight; k++) {
            stars2(k); //metode stars wywo łujemy w metodzie printChristmasTree
        }
    }

    //napisać metode która nic nie zwraca,ale przyjmuje liczbę. wypisuje gwiazdke tyle razy ile wynosi int
    public static void stars2(int b) {

        for (int i = 0; i < b; i++) { //pętla i wykonuje sią a razy, aż dojdzie do b
            System.out.print("*");
        }
        System.out.println();
    }


    public static void christmas(int a) {

        for (int i = 0; i < a; i++) { //pętla i wykonuje sią a razy, aż dojdzie do a
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



