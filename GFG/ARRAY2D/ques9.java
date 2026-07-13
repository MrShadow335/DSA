public class ques9{
    public static void row_print(int[][] arr){
        for(int i =0;i<arr.length;i++){
            for(int j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void col_print(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            for(int i =arr.length-1;i>=0;i--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        row_print(arr);
        col_print(arr);
    }
}