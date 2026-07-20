import java.util.Scanner;
public class q6{
    public static int power(int a, int b){
        if(b==0) return 1;
        int call = power(a,b/2);
        if(b%2==0) return call*call;
        else  return a*call*call;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.print(Math.pow(a,b));
        System.out.print(power(a,b));
    }
}