import java.util.*;
public class q1 {
    public static void transverse(Stack st, Stack st2) {
        while(st.size() > 0){
            int top = st.pop();
            st2.push(top);
        }
    }
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Stack<String> st2 = new Stack<>();
        st.push("Khusi");
        st.push("Abhishek");
        st.push("Preet");
        st.push("Isha");
        st.push("Pranav");
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st +" " +st.size());
        transverse(st, st2);
    }
}
