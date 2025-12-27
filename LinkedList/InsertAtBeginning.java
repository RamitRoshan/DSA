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
            Node temp = new Node(val);

            //empty list
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next =head;
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
