package LinkedList;

public class InsertAtBeginning {

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

        //fn to insert at beginning
        void insertAtBeginning(int val){

            //A new Node object is created.
            Node temp = new Node(val);

            //empty list
            if(head == null){
                head = temp; //head should point to the new node.
                tail = temp; //tail should also point to the same node. (Now the list has one node.)
            }
            //this block runs when the list already has elements.
            else{
                //The new node (temp) points to the current first node.
                //This connects the new node before the existing list.
                //before -> head → 14 → 13 → null, after -> temp → 15 → 14 → 13 → null
                temp.next =head;
                //Now head is updated to the new node.
                //This officially makes temp the first node.
                head = temp;

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
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertAtBeginning(13);


        ll.insertAtBeginning(14);
        ll.display();  // 14 -> 13
    }
}
