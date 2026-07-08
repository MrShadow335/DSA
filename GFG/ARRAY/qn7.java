//Deep copy - any changes does not affect main array
import java.util.Arrays;
public class qn7{
    
    public static void main(String[] args){
        int[] arr = {4,2,7,58,859};
        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 100;
        System.out.println(arr[0]);
        
    }
} 