package Stacks;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {

        //declaring the stack
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Printing the stack: " + st); //[1, 2, 3, 4, 5]

        //making a 2 new empty stack to reverse the stack

        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            rt.push(st.pop());
        }
        System.out.println(rt); //[5, 4, 3, 2, 1] stack is reversed, but we have to reverse it in the original stack

        //making another new stack at and here we will make stack rt empty and will put all ele in at stack
        Stack<Integer> at = new Stack<>();
        while(rt.size()>0){
            at.push(rt.pop());
        }
        System.out.println(at);

        //finally going to reverse the stack in the original stack
        while(at.size()>0){
            st.push(at.pop());
        }
        System.out.println("Reverse ele in the original stack: " + st);
    }
}

//SC -> 2extra stack ->  O(2n) -> O(n)