package LinkedList;

/* Ques). here we are going to find nth node  from end .
100 -> 13 -> 4 -> 5 -> 12 -> 10 -> null
here we have to find 3rd node from end ; i.e 5
m => size of the list

Note: here we traverse multiple time like 1st find the size of
list then again traverse to find the number from end.
*/
public class nthNodeFromEnd {

    public static class Node{
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data = data;
        }
    }

    public static Node nthNode(Node head, int n){
        //finding size
        int size = 0;
        Node temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }
        int m = size- n+ 1;
        temp = head;

        for(int i=1; i<=m-1; i++){  //we will run loop 3 times when we want to find 4th node
            temp = temp.next;
        }
        return temp;
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

        //a is head node here and we have to find 3rd node from end
        Node q = nthNode(a, 3); //5
        System.out.println(q.data);
    }
}
