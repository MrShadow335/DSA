// package GFG.OOPS;
import java.util.*;
/**
 * q4
 */
class Student{
        String name;
        private int roll;
        double cgpa;
        void print(){
            System.out.println(name+" "+cgpa+" "+roll);
        }
        int getroll(){//getter
            return roll;
        }
        void setroll(int x){//setter
            roll = x;
        }
        
    }
public class q4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.cgpa = 8.9;
        s1.name = "Abhi";
        System.out.println(s1.getroll());
        s1.setroll(38);
        System.out.println(s1.getroll());
        s1.print();
    }
    
}