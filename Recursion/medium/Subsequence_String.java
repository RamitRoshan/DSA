package Recursion.medium;

public class Subsequence_String {
    public static void main(String[] args) {
        subseq("", "abc");
    }

    public static void subseq(String p, String up){
        //base condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        //make 2 recursion call, either add it or ignore it.
        //ADD it
        subseq(p+ch, up.substring(1));

        //ignore it
        subseq(p, up.substring(1));
    }
}
