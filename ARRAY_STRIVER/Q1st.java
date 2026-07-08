//LARGEST NO 
public class Q1st{
    public static void LargestNo(int arr[]){
        int largest = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,4,6,8,7};
        LargestNo(arr);
    }
}