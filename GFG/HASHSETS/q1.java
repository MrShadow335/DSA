// package GFG.HASHSETS;
import java.util.HashSet;
import java.util.TreeSet;
/**
 * q1
 */
public class q1 {
    public static void main(String[] args) {
        // TreeSet<Integer> set = new TreeSet<>();
        HashSet<Integer> set = new HashSet<>();
        set.add(96); set.add(97); set.add(95);  set.add(99); set.add(99); set.add(100);
        System.out.println(set);
        System.out.println(set.size());
        System.out.print(set.contains(99)+" ");  System.out.print(set.contains(95)+" ");
        set.remove(100);
        System.out.println(set.contains(100));  System.out.println(set.size());
    }
    
}