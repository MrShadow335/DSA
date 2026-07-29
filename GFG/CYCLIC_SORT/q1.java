
public class q1 {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,7,0,4,6};
        cyclic_sort(arr);
        for(int ele: arr) System.out.print(ele + " ");
    }
    public static void cyclic_sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            if(arr[i] ==  i) i++;
            else{
                int idx = arr[i];
                swap(arr, idx, i);
            }
        }
    }
    public static void swap(int[] arr, int idx, int i ){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
