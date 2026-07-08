//Array is sorted or not
public class Q3 {
    public static void Sorted(int arr[]){
        boolean isSorted = true;
        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
            isSorted = false;
            break;
            }
        }
        System.out.print(isSorted);
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,4,6,7,9,8,11};
        Sorted(arr);
    }
}