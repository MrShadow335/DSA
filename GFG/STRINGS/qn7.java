public class qn7 {
    public static String change(String s1) {
        if(Character.isUpperCase(s1.charAt(0))){
            return s1.toUpperCase();
        }
        else{
            return s1.toLowerCase();
        }
        
    }

    public static void main(String[] args) {

        String s1 = "Aamya";

       String ans = change(s1);

        System.out.println(ans);
    }
}