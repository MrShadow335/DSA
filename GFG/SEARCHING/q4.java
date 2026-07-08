public class q4{
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
                high = mid - 1;
                
            }
            else{
                low = mid +1;
            }
        }

        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {98,87,78,65,56,54,45,43,34,32,21,12};
        int target = 98;
        binarySearch(arr, target);
    }
}