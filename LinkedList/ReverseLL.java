package LinkedList;

public class ReverseLL {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }

    //displaying the Linked list using normal fns
    public static void display(Node head){
        while(head != null){
            System.out.print(head.data +" ");
            head = head.next;
        }
    }

    //Reverse
    public static void displayreverse(Node head){
        if(head == null){
            return;
        }
        displayreverse(head.next);
        System.out.print(head.data + " ");
    }
    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(24);
        Node c = new Node(25);
        Node d = new Node(26);
        Node e = new Node(27);

        //linking the list
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.print("Displaying the linkedlist using fns: ");
        display(a);

        System.out.println();

        System.out.print("Reversing the linkedlist: ");
        displayreverse(a);
    }
}
