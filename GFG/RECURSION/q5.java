import java.util.Scanner;
public class q5{
    public static void print(int n){
        if (n==0) return;
        else{
            System.out.print(n + " ");
            print(n-1);
            if(n!=1) System.out.print(n + " ");
        }
            

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}