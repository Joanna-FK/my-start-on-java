package pl.sda.joanna.lesson6;

public class Nurse extends HospitalEmployee {

    String title;
    int overtime;

   public Nurse (String name, String surname, int age, double salary, String title, int overtime){
    super(name, surname, age);

       this.salary = salary;
       this.title = title;
       this.overtime = overtime;
    }
}
