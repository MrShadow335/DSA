public class qn6 {

    public static int compare(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        for (int i = 0, j = 0; i < n && j < m; i++, j++) {

            if (s1.charAt(i) != s2.charAt(j)) {
                return s1.charAt(i) - s2.charAt(j);
            }

        }

        return n - m;
    }

    public static void main(String[] args) {

        String s1 = "Aamya";
        String s2 = "Bisha";

        int ans = compare(s1, s2);

        System.out.println(ans);
    }
}