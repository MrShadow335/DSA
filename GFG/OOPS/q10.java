import java.util.*;

/**
 * COMPLEX NUMBER REPRESENTATION
 */
class ComplexNumber{
    double x;
    double y;
    ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }
    ComplexNumber(){}
    void print(){
        if(y>0) System.out.println(x+"+"+y+"i");
        else System.out.println(x+"-"+(-y)+"i");
    }
    void add(ComplexNumber z){
        x += z.x;
        y += z.y;
    }
    void multiply(ComplexNumber z){
        double real = x * z.x - y * z.y;
        double img = x * z.y + y * z.x;
        x = real;
        y = img;
    }
    void divide(){

        
    }

}
public class q10 {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,-5);
        z1.print();
        ComplexNumber z2 = new ComplexNumber(3,4);
        z2.print(); // print normal vvlaue of z
        z1.add(z2);
        z1.print();// print added value in z1
        z2.print();
        z2.multiply(z1);
        z2.print();
        z1.print();

    }
    
}