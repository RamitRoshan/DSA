package Stacks;

import java.util.Stack;

public class demoStack {
    public static void main(String[] args) {

        //Declaring Stack
        Stack<Integer> st = new Stack<>();
        //1st ele pushed into stack
        st.push(1);
        st.push(23);
        st.push(90);
        //last ele pushed into stack
        st.push(5);

        //peek -> it returns the top most element of the stack
        System.out.println(st.peek());
    }
}
