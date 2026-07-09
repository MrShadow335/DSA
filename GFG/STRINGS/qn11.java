import java.util.Arrays;
public class qn11{
    public static void LinearSerach(int arr[], int key){
        for(int i = 0;i<arr.length;i++){
            if(key == arr[i]){
                System.out.println("Element found at Index " + i);
            }
        }
    }
    
    public static void main(String[] args){
        int[] arr = {4,2,7,58,859};
        int key = 7;
        LinearSerach(arr,key);
        
        
    }
} 
//Day 35
// I hope 
//Run