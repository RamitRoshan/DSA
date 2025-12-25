package LinkedList;

public class Q1 {

    public static class Node{
        int data;
        Node next; //storing address of next node

        //constructor
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        //5-> 3-> 9-> 8-> 16
        Node a  = new Node(5);
        Node b  = new Node(3);
        Node c  = new Node(9);
        Node d  = new Node(8);
        Node e  = new Node(16);

        //linking nodes with each other
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

    }
}
