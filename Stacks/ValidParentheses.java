package Stacks;

import java.util.Stack;

// "()" -> true, "()[]{}" -> true, "(]" -> false, "([)]" -> false
public class ValidParentheses {

    public static boolean isValid(String s){

        //Stack to store
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // If opening bracket → push expected closing bracket
            if (ch == '(') {
                st.push(')');  // expect ')' later

            } else if (ch == '{') {
                st.push('}');  // expect '}'

            } else if (ch == '[') {
                st.push(']');  // expect ']'
            }
            // If closing bracket
            else {
                // Case 1: No opening bracket to match
                // Case 2: Top of stack does not match current closing bracket
                if (st.isEmpty() || st.pop() != ch) {
                    return false; // invalid
                }
            }
        }
        // After loop:
        // If stack is empty → all brackets matched
        // If not → some brackets were not closed
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "([])";   // valid
        String s2 = "([)]";   // invalid
        String s3 = "(((";    // invalid

        System.out.println(s1 + " -> " + isValid(s1));
        System.out.println(s2 + " -> " + isValid(s2));
        System.out.println(s3 + " -> " + isValid(s3));
    }
}
