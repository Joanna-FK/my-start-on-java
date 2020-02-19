package pl.sda.joanna.lesson7;

public class HospitalEmployee {

    String name;
    String surname;
    int age;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public HospitalEmployee() {
        System.out.println( "jestem konstruktorem klasy HospitalEmployee");
    }

    public HospitalEmployee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
}
