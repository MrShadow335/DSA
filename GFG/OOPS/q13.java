import java.util.*;

/**
 * q13
 */
class Arraylist{
    int[] arr;
    int idx ;
    int size = 0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(idx == arr.length){ //Array is Full
            capacityInc();
        }
        arr[idx] = ele;
        idx++;
        size++;
    }
    void removeFromEnd(){
        if (size == 0) {
        System.out.println("ArrayList is empty.");
        return;
        }
        idx--;
        size--;
    }
    void remove(){

    }
    void add(int index, int val){

    }
    void capacityInc(){
        int[] arr2 = new int[arr.length*2];
        for(int i =0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }
    void set(int index, int val){
        arr[index] = val;
    }
    void display(){
        for(int i =0; i<size; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
public class q13 {
    public static void main(String[] args) {
        // Arraylist arr = new Arraylist(3);
        // arr.add(0); arr.add(20); arr.add(40);
        // arr.display();
        // System.out.println(arr.get(1));
        // arr.display();
        Arraylist arr = new Arraylist(3);

        arr.add(0);
        arr.add(20);
        arr.add(40);

        arr.display();
        System.out.println(arr.get(1));

        arr.add(60);   // Capacity increases automatically
        arr.display();

        System.out.println(arr.capacity());
        }
    
}