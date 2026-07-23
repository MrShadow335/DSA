public class ques16{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length - 1;
        
        reverse(arr, 0, n);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
    public static int reverse(int[] arr,int st, int end){
        if(st>=end) return 0;
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
        return reverse(arr, st+1, end-1);
    }
}