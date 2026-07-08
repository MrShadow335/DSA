public class q13 {
    public static boolean searchMatrix(int[][] arr, int x) {
        int rows = arr.length;
        int col = arr[0].length;
        int low = 0;
        int high = (rows*col) -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int midRow = mid/col;
            int midcol = mid %col;
            if(arr[midRow][midcol]==x) return true;
            else if(arr[midRow][midcol]>x) high = mid -1;
            else low = mid + 1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 5, 9},
            {14, 20, 21},
            {30, 34, 43}
        };
        int x = 21;
        boolean ans = searchMatrix(arr,x);
        System.out.println(ans);
    }
}