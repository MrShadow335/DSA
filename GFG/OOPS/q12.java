import java.util.*;

/**
 * INHERITANCE
 * 
 */
class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{
    int engine;
}
class Aircrafts extends PowerVehicle{
    int rotors;
}
public class q12 {
    public static void main(String[] args) {
        Vehicle cycle = new Vehicle();
    }
    
}