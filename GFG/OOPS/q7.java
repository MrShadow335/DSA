
import java.util.*;
/**
 * q7
 */
public class q7 {
    public static class StudentData{
        String name;
        int roll;
        int[] marks;
        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }
        StudentData(int s){
            marks = new int[s];
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,7,1,3,8};
        StudentData s1 = new StudentData(arr);
        s1.marks[0] = 40;
        System.out.println(s1.marks[0]);
    }
    
}