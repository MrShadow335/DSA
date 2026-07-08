//optimal approach
import java.util.Arrays;
public class qn16{
    public static void missOne(int arr[]){
        int n = arr.length;
        int N = n + 1;
        int totalSum = N*(N+1)/2;
        int arraySum = 0;
        for(int i = 0; i<n; i++){
            arraySum += arr[i];
        }
        System.out.print(totalSum - arraySum);


        }
        
        
    
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7,8,9};
        missOne(arr);
        
        
        
        
    }
} 