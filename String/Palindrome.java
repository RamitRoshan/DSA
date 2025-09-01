package String;

public class Palindrome {
    public static void main(String[] args) {

        String str = "abcd";
        int i=0;
        int j = str.length()-1;

        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("String is not Palindrome");
                return; //exit immediately
            }
            i++;
            j--;
        }
        System.out.println("String is Palindrome");

    }  //Tc = O(n), SC = O(1)

//    public static void main(String[] args) {
//        //using StringBuilder
//        String str = "abcdcba";
//        StringBuilder gtr = new StringBuilder(str);
//        gtr.reverse();
//
//        //We use .toString() to convert a StringBuilder into a String so that it can be compared with another String using .equals().
//        String s = gtr.toString();
//
//        if(str.equals(s)){
//            System.out.println("String is Palindrome");
//        }else{
//            System.out.println("String is not Palindrome");
//        }
//    }
}
