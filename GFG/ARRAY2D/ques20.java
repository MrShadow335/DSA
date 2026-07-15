import java.util.*;

public class ques20 {

    public static void multiply(ArrayList<ArrayList<Integer>> a,
                                ArrayList<ArrayList<Integer>> b) {

        int n = a.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());

            for (int j = 0; j < n; j++) {

                int sum = 0;

                for (int k = 0; k < n; k++) {
                    sum += a.get(i).get(k) * b.get(k).get(j);
                }

                ans.get(i).add(sum);
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        ArrayList<Integer> j = new ArrayList<>();
        j.add(1);
        j.add(2);

        ArrayList<Integer> k = new ArrayList<>();
        k.add(4);
        k.add(5);

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        a.add(j);
        a.add(k);

        ArrayList<Integer> l = new ArrayList<>();
        l.add(6);
        l.add(7);

        ArrayList<Integer> m = new ArrayList<>();
        m.add(8);
        m.add(9);

        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        b.add(l);
        b.add(m);

        multiply(a, b);
    }
}