public class ques7{
    public static void main(String[] args){
        int n = 1230450;
        int rev = 0;
        reverse(n,rev);
        // while(n>0){
        //     rev = rev*10;
        //     rev = rev + n%10;
        //     n = n/10;
        // }
        // System.out.println(rev);
    }
    public static void reverse(int n, int rev){
        if(n==0){
            System.out.print(rev);
            return;
        }
        reverse(n/10, rev*10 + n%10);
    }
}