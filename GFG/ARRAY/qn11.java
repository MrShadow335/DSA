import java.util.Arrays;
public class qn11{
    public static boolean TwoSum(int arr[], int target){
        for(int i = 0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        int[] arr = {4,2,7,58,8,5,-9};
        int target = -2;
        System.out.print(TwoSum(arr,target));
        
        
    }
} 