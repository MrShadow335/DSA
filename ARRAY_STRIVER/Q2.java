//Second largest Element
public class Q2 {
    public static void SecLargestNo(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secL = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(largest < arr[i]){
                secL = largest ;
                largest = arr[i];
            }
            else if(arr[i] > secL && arr[i] != largest){
                secL = arr[i];
            }
        }
        System.out.println(secL);
    }
    public static void main(String args[]){
        //System.out.println("Hello");
        int arr[] = {1,3,5,4,6,7,9,8,11};
        SecLargestNo(arr);
    }
}