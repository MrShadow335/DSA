public class qn4{
    public static void max(int arr[]){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Maximum of the array is :" + max);
    }
    public static void main(String[] args){
        int[] arr = {2,-4,6,-7,8,-8};
        max(arr);
    }
}