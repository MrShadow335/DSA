public class q3 {
    public static void missing(int[] arr) {
        int n = arr.length+1;
        int actualSum = (n*(n+1))/2;
        System.out.println(actualSum);
        int arrSum = 0;
        for(int i =0; i<arr.length; i++){
            arrSum += arr[i];
        }
        System.out.println(arrSum);
        System.out.println(actualSum - arrSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};
        missing(arr);
    }
}
