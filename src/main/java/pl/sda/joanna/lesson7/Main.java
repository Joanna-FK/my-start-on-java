package pl.sda.joanna.lesson7;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Roman", "Kowalski", 45, 4500);
        Employee e2 = new Employee("Roman", "Kowalski", 45, 4500);

        if (e1.equals(e2)) {
            System.out.println("e1 jest takie samo jak e2");

        } else {
            System.out.println("e1 jest inne niż e2");
        }


        Doctor doctor1 = new Doctor("Mariusz", "Kowalski", 40, 4562.55, "Onkology", 1256.33);
        HospitalEmployee emp1 = new Doctor("Mariusz", "Kowalski", 40, 4562.55, "Onkology", 1256.33);

        doctor1.getBonus();
        // emp1.getBonus(); //nie możemy dla pracownika wykorzystrać metody getBonus bo jej nie mamy dla obiektu HositalEmployee

        Track t1 = new Track();
        PassengerCar p1 = new PassengerCar();

        t1.dodatkowaMetodaTrack();
        p1.drive(58);
//interface nie mam dodatklowej metody dlatego nie możemy jehj użyć. musimy siuę odwołać przez Track lub PassengerCar

        Car c1 = new Track();
        Car c2 = new PassengerCar();

        c1.drive(50);
        c1.getDoorNumber();
        c1.getFuelType();
        c1.getGearBox();
        c1.getMaxSpeed();
        c1.stop();
        System.out.println("=========");

        c2.drive(90);
        c2.stop();
        c2.getMaxSpeed();
        c2.getGearBox();
        c2.getFuelType();
        c2.getDoorNumber();
        System.out.println("==========");

        DrawAble rectangle = new Rectangle(4, 8);
        DrawAble triangle = new Triangle(4, 6, 9);
        DrawAble line = new Line(5);

        line.draw();
        System.out.println();
        triangle.draw();
        System.out.println();
        rectangle.draw();


        int[] table = new int[3];
        try {
            table[0] = 0;
            table[1] = 1;
            table[2] = 2;
            table[3] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("powód problemu");
            System.out.println(e.getMessage());
            System.out.println("Brak połączneia z internetem ");
            System.out.println("Popraw połączenoie i spróbuj ponownie");
        } catch (Exception e) {
            System.out.println("Za mało ramu");
            System.out.println("Kup sobie więcej ");
        }


    }

}
