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
    public static void pushAtIndex(Stack<Integer> st, int idx, int ele) {
        Stack<Integer> st2  = new Stack<>();
        while(st.size() > idx){
            st2.push(st.pop());
        }
        st.push(ele);
        while(st2.size() > 0){
            st.push(st2.pop());
        }
        System.out.println(st);
        
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(11);  st.push(12);  st.push(13);  st.push(14); st.push(15);
        //pushAtBottom(st, 16);
        System.out.println(st);
        //System.out.println(st.peek());
        pushAtIndex(st,2,3);
    }
}
