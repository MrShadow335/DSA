public class ques15{
    public static void main(String[] args){
        int[] arr = {2,4,6,7,9,11,13,15,17,19};
        int key = 11;
        int n= arr.length;
        
        System.out.print(binarySearch(arr, key, 0, n-1));
    }
    public static int binarySearch(int[] arr, int key, int lo, int hi){
        if(lo>hi) return -1;
        int mid = lo + (hi - lo)/2;
        if(arr[mid] == key) return mid;
        else if(arr[mid] > key) return binarySearch( arr, key, lo, mid-1);
        else return binarySearch(arr, key, mid+1, hi);
    }
}