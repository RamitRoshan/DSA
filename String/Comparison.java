package String;

public class Comparison {
    public static void main(String[] args) {

//        //this is in String Pool,because the value (Kunal) is same in both.
//        String a = "Kunal";
//        String b = "Kunal";
//
//        //But what is the proof of it, i.e ==
//        System.out.println(a == b);
//        //== it check both the values and reference variable

        //Even though the Value is same, but it may be pointing to the diff. Objects
        //Because we explicitly mentioned(ourself mentioned)
        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        System.out.println(name1 == name2); //false
        System.out.println(name1.equals(name2));  //true

    }
}
