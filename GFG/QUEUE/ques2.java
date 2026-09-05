//package GFG.QUEUE;

/**
 * IMPLEEMTATION OF QUEUE USING LL
 */
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyQueue{
    Node head;
    Node tail;
    int size;

    void add(int x){
        Node temp = new Node(x);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Empty");
        }
        int front = head.val;
        head = head.next;
        size--;
        return front;
    }
    int peek(){
        if(size==0){
            System.out.println("Empty Queue");
            return -1;
        }
        else{
            return head.val;
        }
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class ques2 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(10);
        q.display();
        System.out.println(q.peek());
    }
    
}