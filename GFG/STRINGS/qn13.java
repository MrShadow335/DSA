public class qn13{
    public static void main(String[] args){
        String s ="123445354";
        char[] n = s.toCharArray();
        int sum = 0;
        for(char ch:n){
            sum+=ch -'0';
        }
        System.out.print(sum);
        
    }
} 
