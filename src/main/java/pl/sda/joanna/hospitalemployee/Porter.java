package pl.sda.joanna.hospitalemployee;

import pl.sda.joanna.hospitalemployee.HospitalEmployee;

public class Porter extends HospitalEmployee {


    Shift shift;

    public Porter(String a, String b, int c, double d, Shift e) {
        name = a;
        surname = b;
        age = c;
        salary = d;
        shift = e;
    }

}
