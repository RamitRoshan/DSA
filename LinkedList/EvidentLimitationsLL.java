package LinkedList;

/*
One value is given, and at the end we have to attach that value.
and
only head is given here. no tail is given.
even we are not making any fns under any class.
*/
public class EvidentLimitationsLL {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }

    //fns
    public static void insertAtEnd(Node head, int val){
        //making new node
        Node temp = new Node(val);
        Node t = head;

        //t.next, it will traverse till last, not till null.
        while (t.next != null){
            t = t.next; //it will go till tail (not null)
        }
        t.next = temp;
    }

    //print the list
    public static void display(Node head){
        while (head != null){
            System.out.print(head.data+ " ");
            head  = head.next;
        }
        //for next line
        System.out.println();
    }
    public static void main(String[] args) {
        // creating objects
        Node a = new Node(5);  //head node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5 3 9 8 16
        //linking nodes with each other
        a.next = b; // 5 -> 3 9 8 16
        b.next = c; // 5 -> 3 ->  9 8 16
        c.next = d; // 5 -> 3 ->  9 -> 8 16
        d.next = e;  // 5 -> 3 ->  9 ->  8 -> 16
        display(a);

        // answer we want(insert 87 at end) : // 5 -> 3 ->  9 ->  8 -> 16 -> 87
        insertAtEnd(a, 87);
        display(a);
    }
}
