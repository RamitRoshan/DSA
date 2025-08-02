package conditionalandloops;

public class Reverse_String {
    //Q) Reverse A String In Java

//    public static void main(String[] args) {
//        String str = "Ramit";
//
//        StringBuilder sb  = new StringBuilder(str);
//        sb.reverse();
//
//        String s = sb.toString();
//        System.out.println(s);
//    }

    //without using inbuilt methods
    public static void main(String[] args) {
        String str = "Ramit";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }

}
