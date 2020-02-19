package pl.sda.joanna.hospitalemployee;

public class Main2 {

    public static void main(String[] args) {

        Nurse n1 = new Nurse("Jola", "Kowalska", 45, 2400.45, "ward", 20);
        Porter pp1= new Porter( "Marian", "Kowalski", 68, 2010.56, Shift.NIGHT_SHIFT);
        Doctor d1 = new Doctor( "Wojciech", "Jankowski", 56, 5628.45, "ophthalmologist", 1500.45);



    }



}