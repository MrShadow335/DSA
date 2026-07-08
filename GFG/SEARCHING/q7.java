//return max coumt of [positive or negative no]
public class q7{
    public static void maxCount(int arr[]){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int posCount = 0;
        int negCount = 0;
        while(low<=high){
            int mid = low + (high - low)/ 2;
            //counting negative
            if(arr[mid]>=0){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        negCount = low;
        low = 0;
        high = n-1;
        while(low<=high){
            int mid = low + (high - low)/ 2;
            //counting positive
            if(arr[mid]<=0){
                low = mid + 1;
                
            }
            else{
                high = mid - 1;
            }
        }
        posCount =n- low;
        if(posCount > negCount){
            System.out.print("Positive count is more " + posCount);
        }
        else{
            System.out.print("Negative count is more " + negCount);
        }
        
        
        
    }
    public static void main(String[] args){
        int arr[] = {-7,-6,-5,-4,-3,-2,-1,0,0,0,1,2,3,4,5,6};
        
        maxCount(arr);
        

    }
}