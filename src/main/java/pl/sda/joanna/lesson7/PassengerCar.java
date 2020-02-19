package pl.sda.joanna.lesson7;

public class PassengerCar implements Car {

    public void drive(int speed) {
        System.out.println( "I am Passenger Car");
        System.out.println("I am starting drive with speed " + speed);

    }

    public boolean getGearBox() {
        System.out.println( "I am Passenger Car");
        System.out.println( "I am automatic");
        return true;
    }


    public void stop() {
        System.out.println( "I am Passenger Car");
        System.out.println("I am stopping");

    }


    public int getDoorNumber() {
        System.out.println( "I am Passenger Car");
        System.out.println(5);
        return 5;
    }

    public int getMaxSpeed() {
        System.out.println( "I am Passenger Car");
        System.out.println(90);
        return 90;
    }


    public int getFuelType() {
        System.out.println( "I am Passenger Car");
        System.out.println("ON");
        return 1;
    }
    public void dodatkowaMetodaPassengerCar()
    {

    }
}
