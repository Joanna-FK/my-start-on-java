package pl.sda.joanna.Objects;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(6);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Triangle triangle= new Triangle(4,5,8,4);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Rectangle rectangle= new Rectangle(7,6);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());


    }
}
