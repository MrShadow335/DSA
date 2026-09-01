import java.util.*;
public class ques1 {
    public static int peekAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        for(int i=0; i<=idx-1; i++){
            q.add(q.remove());
        }
        int ans = q.peek();
        for(int i=0; i<=n-idx-1; i++){
            q.add(q.remove());
        }
        return ans;
    }
    public static void addAtIndex(Queue<Integer> q, int idx, int val) {
        int n = q.size();
        for(int i=0; i<=idx-1; i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i =0; i<=n-idx-1; i++){
            q.add(q.remove());
        }
    }
    public static void transverse(Queue<Integer> q) {
        int n = q.size();
        for(int i=0; i<n; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50); q.add(60);
        // System.out.println(q +" "+q.peek());
        // System.out.println(q.remove());
        // System.out.println(q+" "+q.size());
        // System.out.println(q.remove()+" "+q);
        transverse(q);
        addAtIndex(q, 2, 25);
        transverse(q);
        int res = peekAtIndex(q,3);
        System.out.println(res);
    }
}
