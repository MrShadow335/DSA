import java.util.*;
public class q1 {
    public static void transverse(Stack<String> st, Stack<String> st2) {
        while(st.size() > 0){
            String top = st.pop();
            System.out.print(top +" ");
            st2.push(top);
        }
        System.out.println(st2);
        while(st2.size() > 0){
            st.push(st2.pop());
        }
    }
    public static void position(Stack<String> st, int idx, Stack<String> st2) {
        while(st.size() > idx+1){
            st2.push(st.pop());
        }
        System.out.println(st.peek());
        while(st2.size() > 0){
            st.push(st.pop());
        }
    }
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Stack<String> st2 = new Stack<>();
        st.push("Khusi");  st.push("Abhishek"); st.push("Preet");  st.push("Isha"); st.push("Pranav");
        System.out.println(st.size()); System.out.println(st.peek()); System.out.println(st.pop()); System.out.println(st.size());
        System.out.println(st +" " +st.size());
        System.out.println(st);
        transverse(st, st2);
        System.out.println(st);
        int idx = 2;
        position(st,idx, st2);
        

    }
}
