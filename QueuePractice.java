import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
 /**
  * QueuePractice
  */
 public class QueuePractice {
 
    public static void main(String[] args) {
        Queue <Integer> q= new LinkedList<>();
        Deque<Integer> dq=new LinkedList<>();
        dq.add(5);
        dq.add(90);
        dq.add(10);
        dq.add(20);dq.add(30);
        System.out.println(dq);
        // dq.removeFirst();
        dq.removeLast();
        dq.addLast(50);
        dq.addFirst(40);
        
        System.out.println(dq.peek());
    }
 }