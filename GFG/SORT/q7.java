//Selection Sort  - find largest first
import java.util.Arrays;
public class q7{
    public static void comm(int a[], int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[a.length + b.length];
        while(i<a.length && j<b.length){
            if(a[i] == b[j]){
                ans[k] = a[i];
                i++;
                j++;
                k++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        for(int g =0;g<k;g++){
        System.out.print(ans[g] + " ");
        }      
    }
    public static void main(String[] args){
        int[] a = {4,2,7,9,9,8,8,5,-9};
        int[] b = {4,2,5,7,6,8,5,2,4};
        comm(a,b);
        
       
        
        
        
    }
} 