public class q8{
    public static void sqRoot(int n){
        int low = 1;
        int high = n;
        int ans = 0;
        if(n==0) System.out.println(0);
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(mid*mid == n) {
                ans = mid;
                
                break;
            }
            else if(mid*mid > n) high = mid -1;
            else{
                low = mid + 1;
                ans = mid;
            } 
        }
        System.out.println(ans);
        
    }
    public static void main(String[] args){
        int n = 66;
        //BRUTE
        // int root = 0;
        // for(int i = 0;i<n;i++){
        //     if(i*i > n) break;
        //     else root = i;    
        // }
        sqRoot(n);
        

    }
}