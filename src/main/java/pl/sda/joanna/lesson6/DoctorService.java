package pl.sda.joanna.lesson6;

public class DoctorService {
    private static final int NUMBERS_OF_DOCTORS = 5;

    public static Doctor[] doctorsTab() { //tworzy tablice lekarzy, wypełnia i zwraca
        Doctor[] doctors = new Doctor[NUMBERS_OF_DOCTORS];
        doctors[0] = new Doctor("Jan", "Kowalski", 56, 45689.45, "okulista", 4568.45);
        doctors[1] = new Doctor("Janusz", "Markowski", 66, 56689.45, "internista", 4500.45);
        doctors[2] = new Doctor("Mariusz", "Jankowski", 76, 25689.45, "chirurg", 4522.45);
        doctors[3] = new Doctor("Lech", "Noname", 36, 7689.45, "stażysta", 4558.45);
        doctors[4] = new Doctor("Artur", "Kowalski", 46, 65689.45, "Asystent", 6568.45);

        return doctors;
    }

    public static Doctor getRichestDoctor(Doctor[] doctors) {
        Doctor richestDoctor = doctors[0];
        for (int i = 1; i < doctors.length; i++) {
            if (doctors[i].getSalary() > richestDoctor.getSalary()) {
                richestDoctor = doctors[i];
            }
        }
        return richestDoctor;

    }

    public static Doctor getDoctorWithSurname(Doctor[] doctors1, String surname) {
        for (int i = 0; i < doctors1.length; i++) {
            if (doctors1[i].getSurname().equals(surname)) {
                return doctors1[i];
            }
        }
        return null;
    }

    public static int getBigestNumber(int[] numbers) {  //wytypowanie największej liczby z tablicy

        int biggestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber) {
                biggestNumber = numbers[i];
            }
        }
        return biggestNumber;
    }
}

