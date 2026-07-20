import java.util.Scanner;
public class q2{
    static int x = 1;

    public static void print(int n){
        if (x>n) return;
        else{
            System.out.print(x + " ");
            x++;
            print(n); 
        }
            

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}