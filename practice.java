import java.util.*;


public class practice{
    public static void main(String[] args) {
        int n =4356;
        int rev = 0;
        System.out.println(reverse(n, rev));
    }
    public static int reverse(int n, int rev){
        if(n==0) return rev; 
        
        return reverse(n/10, rev*10 + n%10);
        
        
    }
}