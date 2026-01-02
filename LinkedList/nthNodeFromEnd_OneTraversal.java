package LinkedList;

/*
 Ques). here we are going to find nth node  from end .
100 -> 13 -> 4 -> 5 -> 12 -> 10 -> null
here we have to find 3rd node from end ; i.e 5
m => size of the list

we will use fast and slow here and it will traverse once to find
the nth node from end
*/
public class nthNodeFromEnd_OneTraversal {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }

    public static Node nthNode2(Node head, int n){
        Node slow = head;
        Node fast = head;
        // we start i = 1 so that fast moves exactly n nodes ahead of slow
        // n is 1-based (1st, 2nd, 3rd from end)
        // if we start from i = 0, fast will move one extra step and we will reach the wrong node
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow; //at the end, slow will there their target place
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

        //using slow and fast we use One traversal
        Node q = nthNode2(a,2); //find 2nd last node
        System.out.println(q.data);
    }
}
