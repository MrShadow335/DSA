public class qn5{
    public static void min(int arr[]){
        int min = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("Minimum of the array is :" + min);
    }
    public static void main(String[] args){
        int[] arr = {2,-4,6,-7,8,-8};
        min(arr);
    }
}