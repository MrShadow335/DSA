public class qn15{
    public static void main(String[] args){
        String s = "Devesh";
        StringBuilder sb = new StringBuilder(s);
        sb.append("Jain");
        sb.reverse();
        //or
        int i = 0, j=sb.length()-1;
        while(i<j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);
        String n = "Nancy";
        StringBuilder ans = new StringBuilder(n);
        ans.deleteCharAt(1);
        System.out.println(ans);
        ans.insert(1,'e');
        System.out.println(ans);

        //Reverse the String
        String Str = "Nisha";
        StringBuilder an = new StringBuilder(Str);
        an.reverse();
        System.out.println(an);
        Str = an.toString();
        System.out.println(Str);

    }
}
    
