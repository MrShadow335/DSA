//optimal approach
import java.util.Arrays;
public class qn14{
    public static void rev(int arr[]){
          int i = 0;
          int j = arr.length -1;
          while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
          }
          for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
          }  
        }
        
        
    
    
    public static void main(String[] args){
        int[] arr = {4,2,7,9,9,8,8,5,-9};
        
        rev(arr);
        
        
    }
} 