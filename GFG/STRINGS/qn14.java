public class qn14{
    public static boolean Equals(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i = 0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args){
        String s1= "Anjali";
        String s2 = "Anjali";
        System.out.print(Equals(s1,s2));
        // System.out.print(s1.equals(s2));
    }
} 
