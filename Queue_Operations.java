import java.util.*;
/**
 * Queue_Operations
 */
class TheQueue{

    int front,rear, size;
    ArrayList <Integer> q;
      TheQueue(){
        q = new ArrayList <Integer>();
        front=-1;
        rear=-1;
        size=0;
    }
    // EnQueue operation
    public void EnQueue(int ele){
        if (front==-1) {front=0;}
        rear++;
        q.add(rear,ele);
        size++;

    }
    // DeQueue Operation
    public int DeQueue(){
        if(front==-1 || front>rear) return -1;
        int data=q.get(front);
        front++;
        size--;
        return data;
    }
    // is_empty boolean function
    public boolean is_empty(){
        return size==0;
    }
    // Function to get_first_element
    public int get_first_element(){
        return q.get(front);
    }
    //  Function to Display the Elements
    public void display(){
        for (int i=front;i<q.size();i++) {
         System.out.print(q.get(i)+",");
         }
         System.out.println();
    }
}
/**
 * Queue_Operations
 */
public class Queue_Operations {

    public static void main(String[] args) {
        TheQueue obj= new TheQueue();
        obj.EnQueue(5);
        obj.EnQueue(144);
        obj.EnQueue(20);
        obj.display();
        System.out.println(obj.get_first_element());
        System.out.println(obj.DeQueue());
        System.out.println(obj.get_first_element());
        System.out.println(obj.is_empty());
        System.out.println(obj.DeQueue());
        System.out.println(obj.DeQueue());
       obj.display();
       System.out.println(obj.is_empty());

    }
}