//Brute Force
import java.util.Arrays;
public class qn12{
    public static void SecMax(int arr[]){
        int max = arr[0];
        int secMax = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            
            
            for(int j=i;j<arr.length;j++){
                if(arr[i] > secMax && arr[i] != max){
                    secMax = arr[i];
                }
            }
            
        }
        System.out.println(max);
        System.out.print(secMax);
        
        
    }
    
    public static void main(String[] args){
        int[] arr = {4,2,7,58,8,5,-9};
        
        SecMax(arr);
        
        
    }
} 