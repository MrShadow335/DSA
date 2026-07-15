import java.util.Arrays;
public class ques17{
    public static void search(int[][] arr, int target){
        // for(int i=0;i<arr.length;i++){
        //     for(int j =0;j<arr[0].length;j++){
        //         if(arr[i][j] == target){
        //             System.out.println("found at index " + i+","+j);
        //         }
        //     }
        // }
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m-1;
        boolean isFound = false;
        while(j>=0 && i<n){
            if(arr[i][j] == target){
                 isFound = true;
                 break;
            }
            else if(arr[i][j] < target) i++;
            else  j--;
        }
        System.out.print(isFound);
    }
    public static void main(String[] args){
        int[][] arr = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        int target = 45;
        search(arr, target);
    }
}