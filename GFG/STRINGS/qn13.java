public class qn13{
    public static void main(String[] args){
        String s ="123445354";
        int[] n = s.toCharArray(s);
        int sum = 0;
        for(int ele:n){
            sum+=ele;
        }
        System.out.print(sum);
        
    }
} 
