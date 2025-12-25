package LinkedList;

public class basicsll {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }
    public static void main (String[] args){
        // objects
        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        //5 -> 3 -> 9 -> 8 -> 16
        //linking b with a
//        a.next = b;
//        System.out.println(a.next); //O.P: LinkedList.basicsll$Node@5f184fc6
//        System.out.println(b);   //same: LinkedList.basicsll$Node@5f184fc6
//        System.out.println(c);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(c.next.data);
    }
}
