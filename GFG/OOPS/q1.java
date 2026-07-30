
import java.util.*;
public class q1 {
    public static class Student{
        int rNo;
        String name;
        double cgpa;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "ABhi";
        System.out.println("Enter your Roll No ->");
        s1.rNo = sc.nextInt();
        s1.cgpa = 8.01;
        System.out.println(s1.name+" "+s1.rNo+" "+s1.cgpa);

        Student s2 = new Student();
        s2.name = "Nishi";
        s2.rNo = 13;
        s2.cgpa = 9.37;
        System.out.println(s2.name+" "+s2.rNo+" "+s2.cgpa);
    }
}
