public class q2{
    public static void reverse(int n) {
        int rev = 0;
        while(n>0){
        rev = rev*10 + n%10;
        n = n/10;
        }
        System.out.println(rev+" ");

    }
    public static void main(String[] args) {
        int n = 12345;
        reverse(n);
    }
}