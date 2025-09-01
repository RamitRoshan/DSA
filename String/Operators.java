package String;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        //when doing addition with characters, then it converts it into ascii values.
        System.out.println('a' + 'b'); //195(adds using ASCII values)

        System.out.println("a" + "b"); //ab
        System.out.println((char) ('a' + 3)); //d

        System.out.println("a" + 1); //a1
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        //If there is an Object, it will be called toString() on this.
        //It will get the String value added to the String
        System.out.println("Kunal" + new ArrayList<>()); //Kunal[]

    }
}
