//optimal approach
import java.util.Arrays;
public class qn15{
    public static void reverse(int arr[], int i, int j){
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            }
        }
        
        
    
    
    public static void main(String[] args){
        int[] arr = {4,2,7,9,9,8,8,5,-9};
        int k = 2;
        int n = arr.length;
        reverse(arr, 9, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        
        System.out.print(Arrays.toString(arr));
        
    }
} 