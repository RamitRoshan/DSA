# Strings

You can view the detailed notes here: [📄Notes PDF](Notes_Strings.pdf)

- String is a collections of Characters.
- String is most commonly used class in the Java's Class library.
- Every thing which starts with a **Capital Letter** is a Class.
- String is a class, so instances of it, like "apple" , are objects.
- Every String that we create, it's actually an object of type String.
- Strings are immutable in java, once you create it(object), then neither you can change it
nor modify it.
- To change , we have to create new objects.
- String are immutable for security reasons.(for ex: If you are
storing someone's password or name)
 

## Let's see How String Works Internally, how memory management works : 

![img.png](img.png)


Q). What is String Pool? <br>
Ans-String Pool is a separate memory Structure inside the heap <br>

Q). What is the use case , why a separate pool?, Why can't you just put it 
out in the **Heap** normally, like we do for every other objects ? <br>
Ans-All the similar values of Strings are not like recreated in the pool. <br>

- a and b is in stack and "Kunal" is in Heap
- How it stores in the memory?, whether option a) is happening or option b) is happening. How do we check

Q). How do we compare values?, How do we check whether more than 
one reference variable are pointing to the same object or different object ? <br>
Let's see how we can do that..

![img_1.png](img_1.png)


````
String a = "Ramit Roshan
````
- Object (Ramit Roshan) point to the heap memory and Reference variable(a), points to the stack memory.

#### Q). Stack memory :- When we declare 'a' variable <br>
e.g: int a = 10; <br>
so, here the reference variable is stored in stack memory. <br>

#### Q). Heap memory :- Reference variable stored in stack memory is 
pointing to the object of that variable are Stored in Heap memory.

![img_2.png](img_2.png)


## Why String are Immutable ? 
- Here, all person 1 to person4 pointing to the same name and its 'kunal',
but when person 2 wants to change his name from "Kunal" to "Karan", then
all Person name from 1 to 4 will become change & it will become 'karan'. <br>
That's why, for Security reason. String is immutable.

![img_3.png](img_3.png)