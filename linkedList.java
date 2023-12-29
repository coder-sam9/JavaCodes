
public class linkeddList {
// Code is working on online complier not here may be bcz of inbuilt nad downloaded methods classes etc.
    public static void main(String[] args) {
        Node node1=new Node(5);
        Node node2=inserttion_start(node1,4);
        Node node3=inserttion_start(node2,3);
        Node node4=inserttion_start(node3,2);
        Node node5=inserttion_start(node4,1);
        Node node6=inserttion_start(node5,0);
        deletion(node6,0);
        display(node6);

    }
       public static Node inserttion_start(Node head,int value){
        Node new_node= new Node(value);
        new_node.next=head;
        return new_node;
    }
    public static void deletion(Node head,int n){
        Node prev=head;
        Node next=head;
        Node present=head;
        if(n==0){
            head.next=null;
        }
        else{
        while(n>=2){
            System.out.println(prev.value+"is temp");
            prev=prev.next;
            n--;
        }
        present=prev.next;
        prev.next=present.next;
        }
        // prev.next=
        
    }
    public static void display(Node head){
       Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}
class Node {
    int value;
    Node next;
     Node(int a){
    value=a;
    }
}