package LinkedList;

//Displaying the LinkedList using for loop.

public class DisplayLL {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        //5-> 3-> 9-> 8-> 16
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

        Node temp = a;
        for(int i=0; i<5; i++){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

// Output : 5 3 9 8 16
