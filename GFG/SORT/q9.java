//Selection Sort
import java.util.Arrays;
public class q9{
    public static void selSort(int arr[],int k){
        int n= arr.length;
        for(int i = 0; i<k; i++){
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
        System.out.println("ANS " + arr[k-1]);
          
        }
        
        
    
    
    public static void main(String[] args){
        int[] arr = {4,2,7,9,9,8,8,5,-9};
        int k = 4;
        selSort(arr,k);
       
        
        
        
    }
} 