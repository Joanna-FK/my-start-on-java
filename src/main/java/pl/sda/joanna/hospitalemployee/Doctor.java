package pl.sda.joanna.hospitalemployee;

import pl.sda.joanna.hospitalemployee.HospitalEmployee;

public class Doctor extends HospitalEmployee {

   private String specialization;
  private double bonus;

    public Doctor (String name, String surname, int age, double salary, String specialization, double bonus ){

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary= salary;
        this.specialization = specialization;
        this.bonus = bonus;

    }

    public Doctor() {

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
