public class Syntax{
    public static void main(String[] args){
        int n = 5;
        int sum = 0;
        int ans = natural(n, sum);
        System.out.println(ans);

    }
    public static int natural(int n, int sum) {
        if(n != 0){
            sum += n;
            return natural(n-1, sum);
        }
        return sum;
    }
}
// auto push test