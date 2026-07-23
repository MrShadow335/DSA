import java.util.*;
public class ques17{
    public static void main(String[] args){
        String s = "abc";
        subsets("",s,0);
    }
    public static void subsets(String ans, String s, int idx){
        if(idx==s.length()){
            char[] arr = ans.toCharArray();
            Arrays.sort(arr);
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch, s, idx+1);
        subsets(ans, s, idx+1);
    }
}