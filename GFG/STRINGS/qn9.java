import java.util.Scanner;
public class qn9{
    public static void main(String[] args) {

        System.out.println("Enter your beloved numner:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1ST MWTHOD
        // String s = "";
        // s+= n;
        // System.out.println(s);

        //2ND METHOD
        String s = Integer.toString(n);
        System.out.println(s);
    }
}