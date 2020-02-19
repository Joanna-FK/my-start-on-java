package pl.sda.joanna.lesson7;

import java.util.Objects;

public class Employee {

    String name;
    String surname;
    int age;
    double salary;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, salary);
    }

    public Employee(String name, String surname, int age, double salary){
        this.name= name;
        this.surname= surname;
        this.age=age;
        this.salary= salary;

    }
}
