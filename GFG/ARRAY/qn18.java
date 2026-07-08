//Wave form
import java.util.Arrays;
public class qn18{
    public static void wave(int arr[]){
        
        for(int i =0, j=1; i < arr.length-1; i+=2,j+=2){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        }
    
    public static void main(String[] args){
        int[] arr = {4,2,7,9,8,5,-9,10};
        wave(arr);
        
    }
}  