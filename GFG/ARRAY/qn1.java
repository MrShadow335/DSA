public class qn1{
    public static void negative(int arr[]){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] <0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,-4,6,-7,8,-8};
        negative(arr);
    }
}