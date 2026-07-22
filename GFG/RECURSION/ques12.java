public class ques12{
    public static void main(String[] args){
        int m = 4;
        int n  = 4;
        int ans = uniquePath(m,n);
        System.out.print(ans);
    }
    public static int uniquePath(int m, int n){
        if(n==1 || m==1) return 1;
        
        return uniquePath(m,n-1) + uniquePath(m-1, n);
    }
    
}
