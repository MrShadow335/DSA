//Selection Sort
import java.util.Arrays;
public class q5{
    public static void selSort(int arr[]){
        int n= arr.length;
        for(int i = 0; i<n-1; i++){
            int minIdx = i;
            int min = arr[i];
            for(int j = i+1; j<n;j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            //SWAP
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int i =0;i<n;i++){
        System.out.print(arr[i] + " ");
        }
          
        }
        
        
    
    
    public static void main(String[] args){
        int[] arr = {4,2,7,9,9,8,8,5,-9};
        selSort(arr);
       
        
        
        
    }
} 