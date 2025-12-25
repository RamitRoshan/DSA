package LinkedList;

//Displaying the LinkedList using Recursion
public class LLRecursion {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }
    //recursive fns
    public static void displayRecursive(Node head){
        //base cond
        if(head == null) return;
        System.out.print(head.data+ " ");
        displayRecursive(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(15);
        Node b = new Node(16);
        Node c = new Node(17);
        Node d = new Node(18);
        Node e = new Node(19);

        //linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        displayRecursive(a);


    }
}
