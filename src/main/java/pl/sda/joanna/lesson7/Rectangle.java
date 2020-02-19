package pl.sda.joanna.lesson7;

public class Rectangle implements DrawAble {
    int a;
    int b;

    //zadanie pole i obwód prostokąta
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea() {
        return a * b;


    }

    public int getPerimeter() {
        return 2 * a + 2 * b;

    }

    public void draw() {

       for (int i = 0; i < a; i++) {
            for (int j=0; j<b; j++)
            System.out.print("*");
            System.out.println();
        }

        for (int i=0; i<a; i++){
            drawLine();
        }
    }
    private void drawLine (){
        for(int i=0; i<b; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
