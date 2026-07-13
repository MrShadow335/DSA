import java.util.Scanner;
public class ques2{
    public static void max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            
        }
        System.out.println(max);
        
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
        max(arr);
        
        
    }
}
    
