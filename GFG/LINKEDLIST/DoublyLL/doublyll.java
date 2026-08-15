// package GFG.LINKEDLIST.DoublyLL;
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode (int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;

    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(size==0){
            System.out.println("Empty List");
            return;
        }
        else if(size == 1){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteAtTail(){
        if(size == 0){
            System.out.println("Empty List");
        }
        else if(size == 1){
            deleteAtHead();
            return;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    void reverseDisplay(){
        ListNode temp = tail;
        if(size==0){
            System.out.println("Empty List");
            return;
        }
        else{
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.prev;
            }
            System.out.println();
        }
    }

    void insertAtIdx(int idx, int val){
        if(idx<0 && idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx ==0){
            insertAtHead(val);
            return;
        }
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for(int i =0; i<idx; i++){
            temp = temp.next;
        }
        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
    }
}

public class doublyll {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10); list.insertAtHead(20); list.insertAtHead(30); list.insertAtHead(50);
        list.display();
        list.insertAtTail(60); list.insertAtTail(70); list.insertAtTail(80);
        list.display();
        list.insertAtIdx(1,40);
        list.display();
        list.reverseDisplay();
        list.deleteAtHead();
        list.display();
        list.deleteAtTail();
        list.display();
    }
}
