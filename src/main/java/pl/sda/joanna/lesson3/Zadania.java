package pl.sda.joanna.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Zadania {
    public static void main(String[] args) {

        String a = "kotek ali"; //wypisz na ekran długość string i jego podstring (podnapis zaczyna się od pierwszej litery i kończy na ostatniej
        System.out.println(a.length());
        System.out.println(a.substring(1,a.length()));  //przeładowniae metod owerloading
        System.out.println(a.substring(1)); //od którego znaku ma zacząć, od 1 (0123456789)
        int lenhth=a.length();
        System.out.println(a.substring(1, lenhth));
        String substring = a.substring(1,lenhth);
        System.out.println(substring);
        String a2 = new String("fasdfasdfasd"); //nie ma zastosowanie takie tworzenie stringów
        String a3 = new String(a+a2);
        String a4= a+ a2;




       pow(3, 5);
        System.out.println(pow(3, 5));



        print20();
        printOdds();
        suma(3,5);
        System.out.println(suma(3,5)); //wywołanie napisanej metody
    }
    //Napisać metodę która policzy potege danej liczby całkowitej.
    // Tj. przyjmuje dwa argumenty typu int i zwraca typ long.
    public static long pow(int a, int b) {

        long wynik = 1;
        for (int i = 0; i < b; i++) {
            wynik = wynik * a;
        }
        return wynik; //zwraca wynik
    }

    //metodę statyczną (w tej samej klasie co metoda main) która nie przyjmuje żadych argumentów i zwraca void
    // i która wypisuje 20 kolejnych liczb od 0

   public static void print20() {

        for (int i=0; i<=20; i++){
            System.out.println(i);
        }
    }

    //nie przyjmuje żadych argumentów i zwraca void i która wypisuje kolejnych liczb nieparzystych
    public static void printOdds(){
        for(int i =1; i<40; i+=2){
            System.out.println(i);
        }

        int oDDNumber = 1;
        int i=0;
        while (i<20){
            System.out.println(oDDNumber);
            oDDNumber+=2;
            i++;
        }
    }

    public static void printOdds2(){
        int oDDNumber=1;
        for (int i =0; i<20; i++){
            System.out.println(oDDNumber);
            oDDNumber+=2;
        }
    }
    //napisać metode: dwie liczby i zwróci ich sumę bez używanie +
    public static int suma(int a, int b) {
        while (b>0) {
            a++;
            b--;
        }
        return a;
    }

   /* public static void main(String[] args) {

        short s=10;
        int i =20;
        float f=15;
        double d= 18.34567;
        int j= (int)d; //rzutowanie jawne, zmiana doubla na inta. tracimy część po przecinku
        testrzutowanie(s,i,f,d,);
    }
    public static void testrzutowanie(){
        System.out.println(testrzutowanie()short)
    }*/


    //zadanie 4. Napisać metodę która przyjmuje liczbę całkowitą (int) i zwraca obliczoną silnie tej liczby.
   /*public static void main(String[] args) {
      int a = 5;
      System.out.println(silnia(a));
   }

   public static int silnia(int a) {
      int b = 1;
      int i=1;
      while (a>i){
         i++;
         b=b*i;
      }
      return b;
   }*/

  /*  public static void main(String[] args) {
      /*int[][] tablica = {
              {5, 5, 5, 5, 5},
              {5, 5, 5, 5, 5},
              {5, 5, 5, 5, 5},
              {5, 5, 5, 5, 5},
              {5, 5, 5, 5, 5},

      };*/
    //tablica 10x10, wypełnić ją 10

     /*   int[][] tablicaWielowymiarowa = new int[10][10]; //pierwszy ilość wiersz, drugi to kolumny
        /*tablicaWielowymiarowa[0][0]=10;
        tablicaWielowymiarowa[1][0]=10;
        tablicaWielowymiarowa[2][0]=10;
        tablicaWielowymiarowa[3][0]=10;
        tablicaWielowymiarowa[4][0]=10;*/

    /*  for (int i = 0; i < tablicaWielowymiarowa.length; i++) {
          for (int j = 0; j < tablicaWielowymiarowa[i].length; j++) {

              tablicaWielowymiarowa[i][j]=10;
              System.out.print(tablicaWielowymiarowa[i][j]+" ");
          }
          System.out.println();
      }

  }*/
// stworzyć tablice wypełnić ja 0 i po przekątnej dac 1
   /* public static void main(String[] args) {

        int[][] tablicaWielowymiarowa2 = new int[5][5];
        /*tablicaWielowymiarowa2[0][0]=1;
        tablicaWielowymiarowa2[1][1]=1;
        tablicaWielowymiarowa2[2][2]=1;
        tablicaWielowymiarowa2[3][3]=1;
        tablicaWielowymiarowa2[4][4]=1;*/

       /* for (int i = 0; i < tablicaWielowymiarowa2.length; i++) {
            for (int j = 0; j < tablicaWielowymiarowa2[i].length; j++) {

                if (i == j) tablicaWielowymiarowa2[i][j] = 1;
                else tablicaWielowymiarowa2[i][j] = 0;

                System.out.print(tablicaWielowymiarowa2[i][j] + " ");
            }
            System.out.println();
        }

    }*/







  //metoda którą wylosowuje jakąś liczbę
    //obiekt random w klasie, obiekt random posiada metody do losowania liczb z danego zakresu np. 100

   /* public static void main(String[] args) {
        Random random=new Random();
        int i = random.nextInt(100);

            System.out.println(i);

    }*/


}

