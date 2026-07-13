import java.util.Scanner;
public class ques6{
    public static void for_each(int[][] arr){
        //1st approach of for each
        for(int[] a:arr){
            for(int ele:a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        //2nd approach of for each
        for(int i =0;i<arr.length;i++){
            for(int ele:arr[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
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
        for_each(arr);
        
        
    }
}
    
