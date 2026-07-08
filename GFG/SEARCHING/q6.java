public class q6{
    public static void floor(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n -1;
        int floor = -1;
        while(low<=high){
            int mid =low + (high - low)/2;
            if(arr[mid] > target ){
                high = mid -1;
            }
            if(arr[mid] <= target){
                floor = mid;
                low = mid + 1; 
            }
            
        }
        System.out.print(floor);

        
    }
    public static void main(String[] args){
        int[] arr = {-1,0,1,2,5,6,8,9,10}; 
        int target =2; 
        floor(arr, target);
    }
}