package LinkedList;

/* we have to find element based on index
13 -> 4 -> 5 -> 12 -> 10 -> null
int a = getAt(3); ans = 13
i.e
index 3 = 12
*/
public class getElement {

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

        //fn for get elements
        int getAt(int idx){

            //cond. to write if index < 0
            if(idx<0 || idx > size()){
                System.out.println("Wrong index");
                return -1;
            }

            Node temp = head;
            //loop will run till how much index is given (index=3 then it will run 3 times)
            for(int i=1; i<=idx; i++){
                //we go till that node which value we need
                temp = temp.next;
            }
            return temp.data;
        }

        //Insert at end
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

        ll.insertAtEnd(2);
        ll.insertAtBeginning(44);
        ll.insertAtBeginning(11);
        ll.insertAtBeginning(23);
        ll.insertAtBeginning(177);

        ll.display();  // 177 -> 23 ->  11->  44 -> 2

        System.out.println(ll.getAt(3)); //index 3 = 44
    }
}
