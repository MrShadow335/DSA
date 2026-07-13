import java.util.Scanner;
public class ques7{
    public static void snake_print(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j < arr[0].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else{
                for(int j=arr[0].length -1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        
    }
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        int rows = sc.nextInt();
        System.out.println("Enter Columns:");
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];
        System.out.println("Enter Array:");
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();

            }
       }
        snake_print(arr);
        
        
    }
}
    
