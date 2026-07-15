import java.util.*;
import java.util.Arrays;

public class ques16{
    public static void pascal_tri(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int rowIndex = n-1;
        for(int i =0;i<=n;i++){
            ans.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ans.get(i).add(1);
                }
                else{
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    ans.get(i).add(val);
                }
            }
        }
        System.out.print(ans);
        System.out.print(ans.get(n));
    }
    public static void main(String[] args){
        int num = 3;
        pascal_tri(num);
    }
}