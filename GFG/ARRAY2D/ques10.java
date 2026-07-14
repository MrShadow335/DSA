public class ques10{
    public static void transpose(int[][] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void print(int[][] arr){
        for(int i=0; i<arr.length;i++){
            for(int j =0;j<arr[0].length-1;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{4,5,6,7},{7,8,9,6}};
        print(arr);
        transpose(arr);
        print(arr);
    }
}