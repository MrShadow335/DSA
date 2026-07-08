import java.util.Scanner;
public class qn3{
    public static void main(String[] args){
        boolean ans = true;
        String s = "dad";
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                ans = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ans);
            
    }
}