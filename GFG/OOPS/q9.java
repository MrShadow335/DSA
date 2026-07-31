import java.util.*;

/**
 * q9
 */
class Cricketer{
    final static String country = "NZ";
    int runs;
    String name;
    double avg;

    static void greet(){
        System.out.println("I only believe in Jassi Bhai");
    }
}
public class q9 {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        //c1.country = "India";// Error 
        Cricketer c2 = new Cricketer();
        System.out.println(c2.country);
        c2.greet();
    }
    
}