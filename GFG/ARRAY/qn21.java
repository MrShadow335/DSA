import java.util.Arrays;

public class qn21 {

    public static void main(String[] args) {

        int[] a = {2, 4, 7, 8, 9};
        int[] b = {1, 3, 5, 6, 7, 8, 9};

        int[] c = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of a
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements of b
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(c));
    }
}