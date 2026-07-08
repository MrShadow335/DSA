//optimal approach
import java.util.Arrays;
public class q4{
    
    public static void main(String[] args){
        int[] arr = {4,2,0,7,9,0,9,8,0,8,5,0,-9};
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

       
        
        
        
    }
} 