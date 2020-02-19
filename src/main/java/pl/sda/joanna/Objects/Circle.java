package pl.sda.joanna.Objects;

//pole i obwód koła
public class Circle {
    int r;


    public Circle(int r) {
        this.r = r;

    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    public double getPerimeter() {

        return 2 * Math.PI * r;
    }
}
