package Recursion.medium;

/*
you have given a string, and you have to skip all the  "a" from the string and show rest of the string
str = "baccad"  O/P: bccd
*/
public class StreamofString {
    public static void main(String[] args) {
        skip("", "baccdah");
    }

    // p = processed , up = un-processed (original one)
    public static void skip(String p, String up){

        //base condition (when up become empty)
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        //1st character of every fn call
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));

        }else{
            skip(p+ch, up.substring(1));
        }
    }

}
