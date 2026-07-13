import java.util.Scanner;
public class ques3{
    public static void maxRow(int[][] arr){
        int maxSum = Integer.MIN_VALUE;
        int row  = -1;
        for(int i=0; i<arr.length;i++){
            int sum =0;
            for(int j =0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            if(maxSum < sum) {
                maxSum = sum;
                 row = i;
            }
        }
        System.out.println(maxSum + " " +  row);
        
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
        maxRow(arr);
        
        
    }
}
    
