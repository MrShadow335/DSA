import java.util.*;

/**
 * q6
 */


public class q6 {
    public static class Car{
        int price;
        String name;

        Car(){}
        Car(int x, String s){
            name = s;
            price = x;
        }
        Car(String s, int x){
            price = x;
            name = s;
        }
        void print(){
            System.out.println(price+" "+name);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(1250000, "Kio Seltos");
        c1.print();
        Car c2 = new Car("Lord alto", 400000);
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Amaze";
    }
    
}