// merge two sorted arrays keeping duplicates
public class q4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {3,4,5,6,7,8,9,10,11,12};
        mergeSort(a,b);
    }
    public static void mergeSort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i =0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else if(b[j] < a[i]){
                c[k] = b[j];
                j++;
                k++;
            }
            else {
                c[k] = a[i];
                i++;
                k++;
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }
        for(int ele: c){
            System.out.print(ele + " ");
        }
    }
}
