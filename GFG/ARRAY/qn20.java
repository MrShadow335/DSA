//optimal approach
import java.util.Vector;
import java.util.Collections;
public class qn20{
    
    public static void main(String[] args){
        int arr[] = {5,6,7,9};
        int n = arr.length;
        Vector<Integer> ans = new Vector<>();
        int carry = 1;
        for(int i = n-1; i>= 0; i--){
            if(arr[i] + carry <= 9){
                ans.add(arr[i] + carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry == 1){
            ans.add(1);
        }
        Collections.reverse(ans);
        System.out.println(ans);

    } 
       
        
       
        
 }
   