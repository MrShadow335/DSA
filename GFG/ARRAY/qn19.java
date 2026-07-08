//optimal approach
import java.util.ArrayList;
public class qn19{
    
    public static void main(String[] args){
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(25);
        // arr.add(39);
        // System.out.print(arr.get(0));
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(35);
        arr.add(65);
        arr.add(55);
        arr.add(5);
        arr.add(45);
        arr.add(95);
        System.out.println(arr);
        int i = 0;int j = arr.size() - 1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
        

        
        
        
    }
} 