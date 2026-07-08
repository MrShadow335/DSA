//optimal approach
import java.util.Arrays;
public class qn13{
    public static void SecMax(int arr[]){
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
                
            }
            else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
            
            
            
            
        }
        System.out.println(max);
        System.out.print(secMax);
        
        
    }
    
    public static void main(String[] args){
        int[] arr = {4,2,7,9,9,8,8,5,-9};
        
        SecMax(arr);
        
        
    }
} 