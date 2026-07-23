public class ques12{
    public static void main(String[] args){
        int m = 4;
        int n  = 4;
        int sol = uniquePath(0,0,m-1,n-1);
        System.out.print(sol);
        // int ans = uniquePath(m,n);
        // System.out.print(ans);
    }
    public static int uniquePath(int cr, int cc, int lr, int lc){
        if(cr==lr && cc==lr) return 1;
        if(cr>lr || cc>lc) return 0;
        int right = uniquePath(cr, cc+1, lr, lc);
        int down = uniquePath(cr+1, cc, lr, lc);
        return right + down;
    }
    public static int uniquePath(int m, int n){
        if(n==1 || m==1) return 1;
        return uniquePath(m,n-1) + uniquePath(m-1, n);
    }
    
}
