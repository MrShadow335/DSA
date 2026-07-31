
import java.util.*;
/**
 * MAximum of 2 number and 3 number 
 */
public class q5 {
    public static int max(int a, int b){
        return Math.max(a,b); 
    }
    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
    public static void main(String[] args) {
        System.out.println(max(2,4,3));
        System.out.println(max(2,3));
    }
    
}