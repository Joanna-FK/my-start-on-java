package pl.sda.joanna.lesson7;

public interface Car {
//metody zadeklarowane w interface są abstrakcyjne

    void drive (int speed);
    boolean getGearBox();
    void stop();
    int getDoorNumber();
    int getMaxSpeed();
    int getFuelType();

}
