//shallow copy - any changes affect the main array 
public class qn8{
    
    public static void main(String[] args){
        int[] arr = {5,7,9,6,14};
        int[] x = arr;
        x[0] = 2;
        System.out.println(arr[0]);
        
    }
    
} 