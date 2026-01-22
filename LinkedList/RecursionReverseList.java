package LinkedList;

//Reverse the Linked List using Recursion
public class RecursionReverseList {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            //we use this, so we can differentiate the diff btw int data and constructor data
            this.data = data;
        }
    }

    //code to reverse the linkedlist
    public static Node reverse(Node head){
        //base cond.
        if(head.next ==null) return head; //when we're at last node
        //in reverse 1st call then work
        Node newHead = reverse(head.next); //call
        head.next.next = head; // interchanging the connection(work)
        head.next = null; //pointing null after interchange the connections.
        return newHead;
    }

    //displaying the linked list using recursions & in recursion we can't use loop
    public static void display(Node head){
        //base conditions
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data + " "); //work
        display(head.next); //call
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        //linking nodes with each other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print("Original List is : ");
        display(a);

        System.out.print("Reverse List is : ");
        Node r = reverse(a);
        display(r);
    }
}
