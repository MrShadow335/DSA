public class q12 {
    public static int sortRot(int arr[], int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[low]<arr[mid]){//left part sorted
                if(arr[low]<=target && target<arr[mid]) high = mid -1;
                else low = mid + 1;
            }
            else{//right part is sorted
                if(arr[mid] < target && target<=arr[high]) low = mid + 1;
                else high = mid - 1;
            }     
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,1,2,3};
        int target = 1;
        System.out.println(sortRot(arr, target));
    }
}