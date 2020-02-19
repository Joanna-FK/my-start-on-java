package pl.sda.joanna.Objects;

public class Triangle {
    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b,int c, int h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h= h;
    }

    public int getArea(){

        return a*h/2;
    }
    public int getPerimeter(){
        return a+b+c;
    }
}
