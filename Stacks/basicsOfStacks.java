package Stacks;

import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {

        //Declaring Stack
        Stack<Integer> st = new Stack<>();

        System.out.println(st.isEmpty()); //true(when stack is empty)

        //1st ele pushed into stack
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        //last ele pushed into stack
        st.push(34);

        //peek -> it returns the top most element of the stack
        System.out.println(st.peek()); //34

        //printing whole stack
        System.out.println(st); //[1, 23, 90, 5, 34]

        //pop: we can delete top most val of the stack
        st.pop(); //deleted 34
        System.out.println(st);  //[1, 23, 90, 5]

        //finding size of the stack
        System.out.println("Size is: " + st.size()); //Size is: 4 (after deleting 1 ele size is 4)


        // false: when stack has some elements
        System.out.println(st.isEmpty()); //false
    }
}
