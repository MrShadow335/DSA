//package GFG.QUEUE;

class circularQueue{
     int[] arr;
    private int f;
    private int r;
    private int size;

    circularQueue(int capacity){
        arr = new int[capacity];
    }
    void add(int val){
        if(size==arr.length){
            System.out.println("Full Array");
            return;
        }
        arr[r] = val;
        r++;
        if(r==arr.length) r=0;
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("Empty Queue");
            return -1;
        }
        int frontVal = arr[f];
        f++;
        if(f==arr.length) f=0;
        size--;
        return frontVal;
    }
    int peek(){
        if(size==0){
            System.out.println("Empty QUeue");
            return -1;
        }
        return arr[f];
    }
    void display(){
        if(size==0){
            return;
        }
        if(f>=r){
            for(int i=f; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f; i<r; i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class ques3 {
    public static void main(String[] args) {
        circularQueue q = new circularQueue(6);
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        q.display();
        q.add(60);
        q.display();
        q.remove();
        int[] a = q.arr;
        for(int ele: a) System.out.print(ele+" ");

        
    }
}
