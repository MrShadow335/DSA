//IMPLEMENTATION OF STACK USING LINKED LIST
import java.util.*;
class Node{
    int val;
    Node next;
    Node (int val){
        this.val = val;
    }
}
class MyStack{

    Node head;
    int len;
    int peek() throws Exception{
        if(head == null){
            throw new Exception ("Stack Underflow error");
        }
        return head.val;
    }
    int pop() throws Exception{//deleteAtHead
        if(head == null){
            throw new Exception("Stack Underflow error");
        }
        int x = head.val;
        head= head.next;
        len--;
        return x;
    }
    void push(int ele){//addAtHead
        Node temp = new Node(ele);
        if(len == 0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        head = temp;
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}
    public class q3 {
    public static void main(String[] args) throws Exception{
        MyStack st = new MyStack();
        st.pop();
        st.push(10);  st.push(11);  st.push(12);  st.push(13);  st.push(14);  st.push(15);
        st.display();
        st.pop();
        st.display();
    }
}
