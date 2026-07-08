public class q5{
    public static void peakArray(int[] arr){
        int n = arr.length;
        int low = 1;
        int high = n -2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > arr[mid -1] && arr[mid] > arr[mid + 1] ){
                System.out.print(arr[mid] +" is is the peak " );
                break;
            }
            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                low = mid + 1;
                
            }
            else{
                high = mid -1;
            }
        }

        
    }
    public static void main(String[] args){
        int[] arr = {-1,0,1,2,5,6,8,6,3};  
        peakArray(arr);
    }
}