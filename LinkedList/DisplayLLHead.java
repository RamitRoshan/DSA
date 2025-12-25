package LinkedList;

//Writing the code for displaying the LinkedList on the basis of Head Node.
// here, size of linked list will not be given.

public class DisplayLLHead {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }
    public static void main (String[] args){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        //linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //displaying the LinkedList on the basis of Heading Nodes
        Node temp = a;
        while(temp != null){ //printing the list
            System.out.print(temp.data + " ");
            temp = temp.next;  // O/P: 5 3 9 8 16
        }
    }
}
