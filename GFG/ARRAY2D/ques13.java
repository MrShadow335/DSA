
import java.util.*; 
public class ques13{
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
        System.out.println("0th row 1st col --" + arr.get(0).get(1));//Accesing specific element
        //modify element
        System.out.println("0th row 1st col --" + arr.get(0).set(1,0));
        System.out.println(arr);
        //add
        System.out.println(arr.get(0).add(1));
        System.out.println(arr);
    }
}