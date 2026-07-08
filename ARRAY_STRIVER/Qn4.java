// REMOVE DUPLICATES FROM SORTED ARRAY 
public class Qn4 {
    public static int Duplicates(int arr[]) {
        int i = 0;

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String args[]) {
        int arr[] = {1,3,3,5,6,7,7,8,8};
        int len = Duplicates(arr);
        for(int i = 0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}