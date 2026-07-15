public class ques12{
    public static void rotate_90(int[][] arr){
        //Transpose
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse
        for(int i=0; i<arr.length;i++){
            int stCol = 0, endCol = arr[0].length -1;
            while(stCol < endCol){
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                stCol++;
                endCol--;
            }
        }
        print(arr);
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
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        rotate_90(arr);
        
    }
}