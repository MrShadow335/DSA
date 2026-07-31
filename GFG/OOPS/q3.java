
import java.util.*;

/**
 * q3
 */
public class q3 {
    static class Student{
        String name;
        int rNo = 60;
        double cgpa;
        private String branch = "CSE";
        private void print(){
            System.out.println(name+" "+cgpa+" "+rNo+" "+branch);
        }
        public void p(){
            print();
            //for accessing private we have to go through this process
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.p();
        s1.cgpa = 8.05;
        s1.name = "Abhi";
        s1.rNo =60;
        s1.p();
        Student s2 = new Student();
        s2.rNo = 38;
        s2.p();
    }
    
}