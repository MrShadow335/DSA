public class q10 {

    public static int single(int arr[]) {

        int n = arr.length;

        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Found the single element
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            int f, s;

            if (arr[mid] == arr[mid - 1]) {
                f = mid - 1;
                s = mid;
            } else {
                f = mid;
                s = mid + 1;
            }

            // Count elements before the pair
            int leftCount = f;

            if (leftCount % 2 == 0) {
                low = s + 1;
            } else {
                high = f - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,3,4,5,5,6,6,7,7};

        System.out.println(single(arr));
    }
}