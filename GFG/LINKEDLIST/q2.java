    class Node{
        int val;
        Node next;
        Node(){}
        Node(int val){
            this.val = val;
        }
       
    }
    class Linkedlist{
        Node head;
        Node tail;
        int size;

        void display(){
            if(head == null) return;
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val +" ");
                temp = temp.next;
            }
            System.out.println();
            
        }
        void addAtTAil(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void addAtHead(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void DeleteAtHead(){
            if(head == null){
                System.out.println("List is Empty");
                return;
            }
            else{
                head = head.next;
            }
            if(head == null){
                tail = null;
            }
            size--;  
        }
        void DeleteAtTail(){
            if(head == null){
                System.out.println("List is Empty");
                return;
            }
            //only one node
            if(head == tail){
                head = null;
                tail = null;
                size--;
                return;
            }
            //find the second last node
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }
public class q2 {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.display();
        ll.addAtTAil(10);
        ll.addAtTAil(20);
        ll.addAtTAil(30);
        ll.addAtTAil(40);
        ll.addAtTAil(50);
        ll.display();
        ll.addAtHead(60);
        ll.display();
        ll.DeleteAtHead();
        ll.display();
        ll.DeleteAtHead();
        ll.display();
        ll.DeleteAtTail();
        ll.display();
        ll.DeleteAtTail();
        ll.display();

    }
    
}