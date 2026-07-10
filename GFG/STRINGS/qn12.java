public class qn12{
    public static void main(String[] args){
        // String s = "Jaishankar";
        // System.out.print(s.substring(1,5));

        String name ="Gopi";
        int n = name.length();
        for(int i =0;i<n;i++){
            for(int j =i+1;j<=n;j++){
                System.out.print(name.substring(i,j
                ) + " ");
            }
            System.out.println();
        }  
    }
} 
