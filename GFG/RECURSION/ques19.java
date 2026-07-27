/**
 * ques19
 */
import java.util.*;
public class ques19 {
    public static int generate(int n, int l, int r, String s, List<String> ans) {
        if(s.length()==2*n){
            ans.add(s);
            return ans;
        }
        if(l<n) generate(n, l+1, r, s+"(", ans);
        if(r<l) generate(n, l, r+1, s+")", ans);
    }
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        int n =3;
        int sol = generate(n, 0,0,"", ans);
        // return ans;
        System.out.println(sol);
    }
    
}