package String;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Ramit Roshan";
        System.out.println(Arrays.toString(name.toCharArray()));
        //O/P:[R, a, m, i, t,  , R, o, s, h, a, n]

        //.strip() => used to remove extra spaces
        System.out.println("        Sanu     ".strip());


    }
}
