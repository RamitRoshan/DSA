package LinkedList;

public class InsertAtEndLL {

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

        //making fns under class (already used public static in the class so here we will avoid
        void insertAtEnd(int val){
            //making a new node, where we'll add new value into it
            Node temp = new Node(val);

            if(head == null){
                head = temp;  //here, both head and tail are temp
                tail = temp;
            }else{
                tail.next = temp; //tail connected to temp
                tail = temp; //tail moved to temp
            }
        }

        //displaying the Linked list using normal fns
        void display(){
            //storing the head in temp
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
        }

        //making integer fn to find the size/length.
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {

        /*
        like we do in array (int[] arr= new int[5] ), we'll do in LL
        using oops(i.e user-defined data-types)
        */
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display(); // print 4 5

        System.out.println();
        System.out.println("size of linkedlist is: " +ll.size());


        ll.insertAtEnd(12);
        ll.display();

    }
}
