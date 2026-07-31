import java.util.*;
/**
 * q2
 */
public class q2 {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        void print(){
            System.out.println(name+" "+seats+" "+length);
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonet";
        c.seats = 5;
        System.out.println(c.seats);
        c.print();
        change(c);
        c.print();
        
    }
    public static void change(Car c){
            c.seats = 4;
    }
    
}