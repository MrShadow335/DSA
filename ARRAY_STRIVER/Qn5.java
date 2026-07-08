import java.util.Arrays;
// rotate array by 1 places BRUTE FORCE
public class Qn5{
    public static int[] rotateArray(int arr[],int k){
        int n = arr.length;
        //atoring the first value
        int temp= arr[0];

        for(int i =1; i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int k = 1;
        System.out.println(Arrays.toString(rotateArray(arr,k)));
        // System.out.println(rotateArray);

    }
}