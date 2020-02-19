package pl.sda.joanna.lesson7;

public class Triangle implements DrawAble {
    int a;
    int b;
    int c;


    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

   /* public int getArea(){

        int d=a*h/2;
        return d;
    }
    public int getPerimeter(){
       int  e= a+b+c;
        return e;
    }*/

    public void draw() {
        for(int i =0; i<a; i++){
            for(int j=0; j<=i; j++)
            System.out.print("*");
            System.out.println();
        }

        for (int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
