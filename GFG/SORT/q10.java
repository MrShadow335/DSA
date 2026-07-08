import java.util.Arrays;

public class q10 {

    public static void insSort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int j = i;

            while(j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        for(int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 9, 9, 8, 8, 5, -9};

        insSort(arr);
    }
}