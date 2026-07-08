//Selection Sort  - find largest first
import java.util.Arrays;
public class q8{
    public static void twoSum(int arr[], int target){
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j =1;j<n;j++){
            if(arr[j] + arr[i] == target){
                System.out.print(arr[i] +" "+ arr[j] + " is the sol");
            }

            }
        }


        // for(int g =0;g<k;g++){
        // System.out.print(ans[g] + " ");
        // }      
    }
    public static void main(String[] args){
        int[] arr = {7,2,4,3,0,8,-9};
        int target = 9;
        twoSum(arr,target);
        
       
        
        
        
    }
} 