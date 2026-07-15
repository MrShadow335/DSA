public class ques18{
    public static void spiral(int[][] arr){
        int m = arr.length, n = arr[0].length;
        int fRow = 0, lRow = m-1;
        int fCol = 0, lCol = n-1;
        while(fRow <= lRow && fCol <= lCol){
            for(int j=fCol;j<=lCol;j++){
                System.out.print(arr[fRow][j]+ " ");
            }
            fRow++;
            if(fRow>lRow || fCol > lCol) break;
            for(int i=fRow;i<=lRow;i++){
                System.out.print(arr[i][lCol] + " ");
            }
            lCol--;
            if(fRow>lRow || fCol > lCol) break;
            for(int j=lCol;j>=fCol;j--){`
                System.out.print(arr[lRow][j] + " ");
            }
            lRow--;
            if(fRow>lRow || fCol > lCol) break;
            for(int i=lRow;i>=fRow;i--){
                System.out.print(arr[i][fCol]+" ");
            }
            fCol++;
            
        }
        

    }
    // public static void print(int[][] arr){
    //     for(int i=0; i<arr.length;i++){
    //         for(int j =0;j<arr[0].length;j++){
    //             System.out.print(arr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
        
    // }
    public static void main(String[] args){
        int[][] arr = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        spiral(arr);
    }
}