package LinkedList;

/*
Given a linked list, split it into two lists such that one
contains odd values, while the other contains even values.

3-> 5-> 4-> 1-> 2-> 8-> 10-> 13-> null

Output:
3-> 5-> 1-> 13 -> null  //odd
4 -> 2-> 8-> 10-> null  //even

solve it with extra space.
*/
public class SplitOddEven {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
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
        //3-> 5-> 4-> 1-> 2-> 8-> 10-> 13-> null
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(13);

        //linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        //making new node, can give any value ->  dummy heads (extra space)
        //Acts as a permanent starting point -> Never moves
        Node oddDummy = new Node(-1);
        //oddTail is used to move (travel) and add nodes
        Node oddTail = oddDummy;

        // Dummy head for even list (extra space)
        Node evenDummy = new Node(0);
        Node evenTail = evenDummy;

        //Pointer to traverse the original list
        Node head = a;

        while(head != null){
            // If value is odd, add to odd list
            if(head.data % 2 != 0){
                oddTail.next = new Node(head.data); // create new node
                oddTail = oddTail.next; // move tail forward

            }
            // If value is even, add to even list
            else{
                evenTail.next = new Node(head.data);
                evenTail = evenTail.next;
            }
            // Move to next node in original list
            head = head.next;
        }

        System.out.println("Odd List: ");
        display(oddDummy.next);

        System.out.println("Even List: ");
        display(evenDummy.next);
    }
}
