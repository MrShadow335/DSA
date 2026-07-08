public class q14 {
    public static int miss(int[] arr, int k) {
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;
            if(missing >= k) high = mid - 1;
            else low = mid + 1;

        }
        return high + 1+ k;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7};
        int k = 3;
        int ans = miss(arr,k);
        System.out.println(ans);
    }
}