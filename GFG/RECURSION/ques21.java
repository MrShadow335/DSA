/**
 * TOWER OF HANOI
 */
public class ques21 {
    public static void main(String[] args) {
        hanoi(5,'a','b','c');
    }
    public static void hanoi(int n, char a, char b, char c) {
        if(n==0){  
            return;
        } 
        hanoi(n-1, a, c, b);
        
        System.out.println(a+ "->"+ c);
        hanoi(n-1, b, a, c);
        
        
    }
    
}