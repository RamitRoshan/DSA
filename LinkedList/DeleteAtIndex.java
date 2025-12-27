package LinkedList;

/*
we have to delete at index :
before deletion: 5 -> 3 ->  9 ->  8 -> 16
after deletion (at index = 2) : 5 -> 3 ->  8 -> 16
*/
public class DeleteAtIndex {

    public static class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;

        //delete at index
        void deleteAt(int idx){

            //edge cases
            if (head == null) return;
            if (idx == 0) {
                head = head.next;
                return;
            }


            Node temp = head; //this temp will traverse the linked list
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;  //move next, next
            }
            temp.next = temp.next.next;
            tail = temp;
        }

        //fns for printing the list
        void display(){
            //storing the head in the temp
            Node temp = head;
            while (temp !=  null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        linkedlist ll = new linkedlist();

        //creating object (based on Node class)
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



        //set head and tail
        ll.head = a;
        ll.tail = e;

        // before deletion
        ll.display();   // 5 3 9 8 16

        // delete at index 4 (0-based index)
        ll.deleteAt(4);

        // after deletion
        ll.display();   // 5 3 8 16

        System.out.println(ll.tail.data);
    }
}
