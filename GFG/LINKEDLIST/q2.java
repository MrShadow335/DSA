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

        void delete(int idx){
            if(idx<0 && idx>=size){
                System.out.println("Invalid Input");
                return;
            }
            if(idx==0) {
                DeleteAtHead();
                return;
            }
            Node temp = head;
            for(int i=1; i <= idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx==size-1) tail = temp;
            size--;
        }
        int get(int idx){
            Node temp = head;
            for(int i =0; i<idx; i++){
                temp = temp.next;
            }
            return temp.val;
        }
        void insert(int idx, int val){
            if(idx<0 || idx>size){
                System.out.println("Invalid Input");
                return;
            }
            if(idx==0) addAtHead(val);
            else if(idx==size) addAtTAil(val);
            else{
                Node temp = head;
                for(int i = 1; i<=idx-1; i++){
                    temp = temp.next;
                }
                Node t = new Node(val);
                t.next = temp.next;
                temp.next = t;
                size++;
            }
        }
        int search(int val){
            if(head==null) return -1;
            Node temp = head;
            int idx = 0;
            while(temp != null){
                if(temp.val == val) return idx;
                temp = temp.next;
                idx++;
            }
            return -1;
        }
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
        ll.addAtTAil(10);  ll.addAtTAil(20);  ll.addAtTAil(30);   ll.addAtTAil(40);   ll.addAtTAil(50);
        ll.display();
        ll.addAtHead(60);   ll.display();
        ll.DeleteAtHead();  ll.display();
        ll.DeleteAtHead();  ll.display();
        ll.DeleteAtTail();  ll.display();
        ll.DeleteAtTail();  ll.display();
        System.out.println(ll.search(30));
        ll.insert(2,40);    ll.display();
        System.out.println(ll.get(2));
        ll.delete(2);       ll.display();
    }
    
}