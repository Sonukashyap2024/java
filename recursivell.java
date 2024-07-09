class Node{
     int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}

public class recursivell {
    public static void display(Node head){

        if(head==null) return;
       
       display(head.next);
       System.out.println(head.val);

    }
    
    public static void main(String args[]){

        Node a= new Node(1);
        
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
       // a.next=b;
        display(a);
        System.out.println(a.val);
    }

    
}
