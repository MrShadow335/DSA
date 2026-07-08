import java.util.Arrays;
public class qn10{
    
    public static void main(String[] args){
        int[] arr = {4,2,7,58,859};
        
        for(int i = 0;i<arr.length;i++){
            if(i %2 == 0){
                arr[i]+= 10;
            }
            else{
                arr[i] *= 2;
            }
        }
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
} 