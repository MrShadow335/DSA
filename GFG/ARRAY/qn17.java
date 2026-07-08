//optimal approach
import java.util.Arrays;
public class qn17{
    public static void seg(int arr[]){
        //Arrays.sort(arr); -- not used but it is also correct
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] == 0 && arr[j] == 1){
                i++;
                j--;
            }
            else if (arr[i]==0 && arr[j] == 0){
                i++;
            }
            else if(arr[j]==1 && arr[j]==1){
                j--;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
                i++;
                j--;
            }
        }
        for(int k = 0; k< arr.length; k++){
            System.out.print(arr[k]);
        }
        }
        
        
    
    
    public static void main(String[] args){
        int[] arr = {0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,1,1};
        seg(arr);
        
        
        
        
    }
} 