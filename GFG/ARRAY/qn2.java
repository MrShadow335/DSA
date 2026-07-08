import java.util.Scanner;

public class qn2{
    
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<arr.length;i++){
            System.out.print("Enter your number");
            arr[i] = sc.nextInt();
        }
        System.out.println("Arrays elements are:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}