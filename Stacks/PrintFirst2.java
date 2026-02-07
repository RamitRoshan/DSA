package Stacks;

import java.util.Stack;

//Print first 2 ele in the stack and to get it we have to delete rest off the ele.
public class PrintFirst2 {
    public static void main(String[] args) {

        //Declaring stack
        Stack<Integer> st = new Stack<>();



        st.push(1); //1st ele push into stack
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);

        //delete ele till > 2
        while (st.size() > 2){
            st.pop();
        }

        //print top most ele(after deletion)
        System.out.println(st.peek());

        //printing 1st two elements
        System.out.println(st); //[1, 23]


    }
}
