
class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}

public class linklist {

    public static void main(String[] args) {

        Node a= new Node(10);
        Node b= new Node(600);
        Node c= new Node(400);
        Node d= new Node(20);
         a.next=b;
         b.next=c;
         c.next=d;

       Node temp=a;
       // temp = a;
        while(temp!=null) {
            System.out.println(temp.val);
            temp=temp.next;
        }

    }
}

