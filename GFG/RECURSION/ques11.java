public class ques11{
    public static void main(String[] args){
        int n = 6;
        int ans = stairs(n);
        System.out.print(ans);
    }
    public static int stairs(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return stairs(n-1) + stairs(n-2);
    }
    
}
