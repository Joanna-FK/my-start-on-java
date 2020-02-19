package pl.sda.joanna.lesson7;

public class Track implements Car {



    public void drive(int speed) {
        System.out.println("I am track");
        System.out.println("I am starting drive with speed " + speed);
    }


    public boolean getGearBox() {
        System.out.println("I am track");
        System.out.println( "I am manual");
        return true;
    }


    public void stop() {
        System.out.println("I am track");
        System.out.println("I stoping");

    }


    public int getDoorNumber() {
        System.out.println("I am track");
        System.out.println(2);
        return 2;
    }


    public int getMaxSpeed() {
        System.out.println("I am track");
        System.out.println(90);
        return 90;
    }


    public int getFuelType() {
        System.out.println("I am track");
        System.out.println("ON");
        return 1;
    }
    public void dodatkowaMetodaTrack(){

    }
}
