package pl.sda.joanna.hospitalemployee;


public class Nurse extends HospitalEmployee {

    String title;
    int overtime;

   public Nurse (String name, String surname, int age, double salary, String title, int overtime){

       this.name= name;
       this.surname = surname;
       this.age = age;
       this.salary = salary;
       this.title = title;
       this.overtime = overtime;
    }
}
