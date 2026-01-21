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

    //displaying the linked list using fns
    public static void display(Node head){
        while(head != null){
            System.out.print(head.data+ " ");
            head = head.next;
        }
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
    }
}
