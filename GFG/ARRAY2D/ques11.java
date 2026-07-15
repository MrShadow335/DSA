public class ques11{
    public static void transpose(int[][] arr){
        int row = arr.length, col = arr[0].length;
        int[][] b = new int[col][row];
        for(int i =0;i<b.length;i++){
            for(int j =0;j<=b[0].length-1;j++){
                b[i][j] = arr[j][i];
            }
        }
        print(b);
    }
    public static void print(int[][] arr){
        for(int i=0; i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,6}};
        print(arr);
        transpose(arr);
        
    }
}