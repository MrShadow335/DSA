import java.util.Scanner;

public class Main {

    // Static method outside main()
    static int countSegments(long n) {
        int[] segments = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int total = 0;

        while (n > 0) {
            int digit = (int)(n % 10);
            total += segments[digit];
            n /= 10;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(countSegments(n));

        sc.close();
    }
}