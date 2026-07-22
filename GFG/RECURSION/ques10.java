public class ques10{
    public static void main(String[] args){
        int a = 6;
        int b = 15;
        System.out.print((a*b)/gcd(a,b));
    }
    public static int gcd(int a, int b){
        
        if(b%a == 0) return a;
        return gcd(b%a, a);
    }
    
}