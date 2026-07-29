
/**
 * Missing in Array
 */
public class q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        miss_Arr(arr);
    }
    public static void miss_Arr(int[] arr) {
        int i=0;
        int n = 1+ arr.length;
        while(i<arr.length){
            if(arr[i]==i+1 || arr[i] == n){
                i++;
            }
            else{
                int idx = arr[i] -1;
                swap(arr, idx, i);
            }
        }
        for(int j =0; j<arr.length; j++){
            if(arr[j] != j+1){
                System.out.print(j+1);
                return;
            }
        }
        System.out.print(n);
    }
    public static void swap(int[] arr, int idx, int i ){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}