
import java.util.*; 
public class ques14{
    public static void print_for(ArrayList<ArrayList<Integer>> arr){
        for(int i =0;i<arr.size(); i++){
            for(int j =0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void print_for_each(ArrayList<ArrayList<Integer>> arr){
        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1); a.add(2); a.add(3); a.add(4);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4); b.add(5); b.add(6);b.add(7);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(8); c.add(9); c.add(10); c.add(11);
        ArrayList<Integer> d = new ArrayList<>();
        d.add(12); d.add(13); d.add(14); d.add(15);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c); arr.add(d); 
        System.out.println(arr);
        print_for(arr);
        print_for_each(arr);
    }
}