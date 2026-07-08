public class q2{
    public static void binarySearch(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n -1;
        int idx = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                idx = mid;
                high = mid - 1;
            }
            else if(arr[mid] < target){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.print("first found at index " + idx);

        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,5,5,5,6,8};
        int target = 1;
        binarySearch(arr, target);
    }
}