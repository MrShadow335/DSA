public class ques14{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 4;
        
        System.out.print(linearSearch(arr, key, 0));
    }
    public static int linearSearch(int[] arr, int key, int idx){
       if(idx == arr.length) return 0;
       if(arr[idx] == key) return idx;
       return linearSearch(arr, key, idx+1);
    }   
}
