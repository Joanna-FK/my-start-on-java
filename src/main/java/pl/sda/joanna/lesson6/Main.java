package pl.sda.joanna.lesson6;


public class Main {

    public static void main(String[] args) {
        //Doctor doctor = new Doctor( "Proktolog",67.89); //przy utworzeniu doctora został utruchomiony konstruktor
        // klasy Hospital i Doctor
        // Doctor d2 = new Doctor( "Ginekolog amator", 589.56);

        //Doctor d3 = new Doctor( "Jan", "Kowalski", 56, "okulista", 5689.56);

        //HospitalEmployee d4 = new Doctor("Jan", "Kowalski", 56, "okulista", 5689.56 ); //coś jest czymś.
        // stworzenie z odwołaniem sie do klasy matki. odwrotnie nie można
        Doctor[] doctors = DoctorService.doctorsTab();
        Doctor richestDoctor = DoctorService.getRichestDoctor(doctors);
        System.out.println(richestDoctor.getName());

        Doctor doctorWithSurname = DoctorService.getDoctorWithSurname(doctors, "Kowalski");
        if (doctorWithSurname != null) {
            System.out.println(doctorWithSurname.getName() +" "+doctorWithSurname.getSurname());}

             else{
                System.out.println("Nie ma takiego lekarza");
            }

             HospitalEmployee he = new Doctor();
             he.getAge();
          Doctor dd = new Doctor();
          dd.getSalary();
          Object o = new Doctor();
        ((Doctor)o).getSalary();  //rzutowanie

    }
}
