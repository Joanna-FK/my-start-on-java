package pl.sda.joanna.lesson6;

public class Porter extends HospitalEmployee {

    Shift shift;

    public Porter(String name, String surname, int age, double salary, Shift e) {
        super( name,surname,age, salary);

        shift = e;
    }

}
