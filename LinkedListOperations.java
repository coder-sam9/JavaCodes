import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList list= new LinkedList<>();
        int arr[]= new int[15];
        arr[0]=0;
        arr[1]=1;
        list.add(0);
        list.add(1);
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-2]+arr[i-1];
            list.add(arr[i]);
        }
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(15);
        
        
    }
}
