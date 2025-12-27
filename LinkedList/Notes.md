# LinkedList

Node is a datatype used by linkedlist.

Q). Why Node is a datatype for linkedlist

You declared:

````
public static class Node {
int data;
Node next;
}
````
and inside linkedlist you wrote:

````
Node head = null;
Node tail = null;
````


#### This means:

- Node is a class

- Every class in Java is also a user-defined data type

- So Node is the data type of:

        - head
        - tail
        - next

##### 👉 In simple terms:
linkedlist is made up of Node objects

###### Relationship between linkedlist and Node

- linkedlist → manages the list

- Node → stores individual elements

This is called a “has-a” relationship:

- A linkedlist has Nodes


Note:
✔️ Yes — Node is a user-defined data type used inside linkedlist.
✔️ head, tail, and next are all variables of type Node.
✔️ linkedlist is a structure built using Node objects.