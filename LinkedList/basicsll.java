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

    }
}
