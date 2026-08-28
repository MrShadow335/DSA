import java.util.*;
public class q2 {
    public static void pushAtBottom(Stack<Integer> st, int ele) {
       if(st.size() == 0) {
        st.push(ele);
        return;
       }
       int top = st.pop();
       pushAtBottom(st,ele);
       st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(11);  st.push(12);  st.push(13);  st.push(14); st.push(15);
        pushAtBottom(st, 16);
        System.out.println(st);
        System.out.println(st.peek());
    }
}
