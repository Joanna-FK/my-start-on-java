package pl.sda.joanna.lesson7;

public class Line implements DrawAble {
    int a;

    public Line(int a) {
        this.a = a;

    }

    public void draw() {
        for (int i = 0; i < a; i++) {
            System.out.print("-");

        }
    }

}
