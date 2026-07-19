//Sum of prime number in a given range
// 2nnd dayy
import java.util.Scanner;
public class que1{
    public static boolean prime(int n){
        boolean isPrime = false;
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }
            
        }
        return true;
    }
    public static int totalprime(int n){
        int sum = 0;
        if(n==0) return sum;
        if(n==1) return sum;
        for(int i =2;i<=n;i++){
            
            if((prime(i))== true){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        System.out.println(totalprime(n));
        
    }
}
