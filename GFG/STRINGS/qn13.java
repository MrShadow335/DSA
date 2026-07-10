public class qn13{
    public static void main(String[] args){
        //SUM OF A NO IN A STRING
        // String s ="123445354";
        // char[] n = s.toCharArray();
        // int sum = 0;
        // for(char ch:n){
        //     sum+=ch -'0';
        // }
        // System.out.print(sum);
        
        //SUM OF ALL SUBSTRING OF A NO
       
        String s = "123";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int num = 0;

            for (int j = i; j < s.length(); j++) {
                num = num * 10 + (s.charAt(j) - '0');
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
    
