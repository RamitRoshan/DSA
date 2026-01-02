package LinkedList;

/* again here we have to remove nth node from the end
and here we will use One-Traversal i.e slow and fast.
*/
public class RemoveNthNodeFromEnd {

    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data = data;
        }
    }

    // function to delete nth node from end
    public static Node deleteNthFromEnd(Node head, int n){
        Node slow = head;
        Node fast = head;

        // move fast n steps ahead. fast ko agge leke jaana hai like here 2 step bcz we need to remove last 2nd node.
        for (int i=1; i<=n; i++){
            fast = fast.next;
        }
        // edge case: when we have to delete first node.
        if(fast == null){
            head = head.next; // move head forward
            return head;  //return new head
        }
        //we have to move fast till tail here,as we have to remove here
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        // remove nth node from end
        slow.next = slow.next.next;
        return head; // return updated list
    }
    //making a display fns to print the linkedlist
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // print original list
        display(a);

        // delete 2nd node from end (write a = to delete head)
        a = deleteNthFromEnd(a, 2 );
        // print updated list
        display(a);
    }
}
