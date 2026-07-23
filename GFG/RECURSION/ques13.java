public class ques13{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        recArray(arr, 0);  
    }
    public static int recArray(int[] arr, int idx){
       if(idx == arr.length) return 0;
       System.out.print(arr[idx] + " ");
       return recArray(arr, idx+1);
    }   
}
