//Bubble sort  in Reverse mode
import java.util.Arrays;
public class q3{
    public static void sort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            boolean isSorted = false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = true;
                }
            }
            if(isSorted == false) break;
        }
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
    
    public static void main(String[] args){
        int[] arr = {4,2,7,9,9,8,8,5,-9};
        sort(arr);
        //Arrays.sort(arr);  //Built In
        // for(int i = 0;i<arr.length; i++){
        //     System.out.print(arr[i] +" ");
        // }

        
    }
} 