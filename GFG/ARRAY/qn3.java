public class qn3{
    public static void sum(int arr[]){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        int[] arr = {2,-4,6,-7,8,-8};
        sum(arr);
    }
}