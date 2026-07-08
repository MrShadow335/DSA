public class q1{
    public static void binarySearch(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                System.out.print(arr[mid] + " found at index " + mid);
                break;
            }
            else if(arr[mid] < target){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }

        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,9,10,11,12,45,54,65,76,78,79,87,88,89};
        int target = 4;
        binarySearch(arr, target);
    }
}