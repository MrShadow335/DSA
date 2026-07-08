public class q8{
    public static void sqRoot(int n){
        int low = 1;
        int high = n;
        if(n==0) System.out.println(0);
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(mid*mid == n) {
                System.out.println(mid);
                break;
            }
            else if(mid*mid > n) high = mid -1;
            else low = mid + 1;
        }
        
    }
    public static void main(String[] args){
        int n = 25;
        //BRUTE
        // int root = 0;
        // for(int i = 0;i<n;i++){
        //     if(i*i > n) break;
        //     else root = i;    
        // }
        sqRoot(n);
        

    }
}