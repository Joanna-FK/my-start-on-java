package pl.sda.joanna.lesson5;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.loadData();
        System.out.println(p1.name);
        System.out.println(p1.surname);
        System.out.println(p1.age);
        System.out.println(p1.sex);

    }
}
