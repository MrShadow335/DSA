//if not perfect sq then return last perfect square
public class q9{
    public static void sqRoot(int n){
        int low = 1;
        int high = n;
        if(n==0) System.out.println(0);
        int maxSq = 1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(mid*mid == n) {
                maxSq = mid;
                break;
            }
            else if(mid*mid < n){
                maxSq = mid;
                low = mid + 1;
            }
            else high = mid -1;
        }
        System.out.println(maxSq);
        
    }
    public static void main(String[] args){
        int n = 26;
        //BRUTE
        // int root = 0;
        // for(int i = 0;i<n;i++){
        //     if(i*i > n) break;
        //     else root = i;    
        // }
        sqRoot(n);
        

    }
}