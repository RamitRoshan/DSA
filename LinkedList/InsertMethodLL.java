package LinkedList;

public class InsertMethodLL {

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


        //fn in which idx, we enter the value
        void insertAt(int idx, int val){
            Node t = new Node(val);
            //node for travel
            Node temp = head;

            // when we want to add ele at the end. like size 4 and we add at index 5
            if(idx == size()){
                insertAtEnd(val);
                return;
            } else if (idx == 0) {  //when we have to insert data at beginning
                insertAtBeginning(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("Wrong index");
                return; //stop
            }

            //traverse the loop one less the idx where we have to insert
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

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

        //displaying/print the Linked list using normal fns
        void display(){
            //storing the head in temp
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
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
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(15);
        ll.insertAtEnd(12);
        ll.display(); // print 4 5 15 12


        System.out.println("size of linkedlist is: " +ll.size());  //size of linked list is: 4

        //inserting at index 1
        ll.insertAt(2, 201);  //4 -> 5 -> 201 -> 15 ->  12
        ll.display();


        //inserting at last index
        ll.insertAt(5, 205);  //4 -> 5 -> 201 -> 15 ->  12 -> 205
        System.out.print("Inserting 205 at last index: ");
        ll.display();
        System.out.println(ll.tail.data); // 205


        //inserting at oth(1st) index.
        ll.insertAt(0,100);
        System.out.print("Inserting 100 at oth/beginning index: ");
        ll.display();
        System.out.println(ll.head.data); //100

    }
}
