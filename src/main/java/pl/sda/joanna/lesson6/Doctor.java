package pl.sda.joanna.lesson6;

public class Doctor extends HospitalEmployee {

    private String specialization;
    private double bonus;


    public Doctor(String name, String surname, int age , double salary, String specialization, double bonus) {
        super(name, surname, age , salary);
        this.specialization = specialization;
        this.bonus = bonus;
        //System.out.println( "Jestem konstruktorem klasy Doctor");
    }

    public Doctor() {
        super();
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
