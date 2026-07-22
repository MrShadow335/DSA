public class ques8{
    public static void main(String[] args){
        int a = 6;
        int b = 15;
       System.out.print(gcd(a,b));
    }
    public static int gcd(int a, int b){
        // int hcf = 1;
        // for(int i = 2; i<= Math.min(a,b); i++){
        //     if(a%i == 0 && b%i == 0) hcf = i;
        // }
        // System.out.print(hcf);

        if(b%a == 0) return a;
        return gcd(b%a, a);
    }
    
}