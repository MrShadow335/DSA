import java.util.Scanner;
public class qn2{
    public static void main(String[] args){
        int count = 0;
        String s = "For me being successfull is more needed rather than being alive";
        for(int i = 0; i<s.length();i++){
            char t = s.charAt(i);
            if(t=='a' || t=='i' || t=='e' || t=='o' || t=='u'){
                count++;
            }
        } 
        System.out.println(count);     
        System.out.println(s.length());     
    }
}