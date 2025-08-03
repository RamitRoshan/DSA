package Functions;

import java.util.Arrays;

//variable arguments shows a collection of arrays...
public class VarArgs {
    public static void main(String[] args) {
        //fun(4,5,6,7,4,22,456,3456);
        multiple(3,5,"ramit", "roshan", "sinni", "sanu", "rayma");
    }

    //multiple var arguments, and most important the variable length arg will be the last one,
    // because it's a collection so it will keep going
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(new String[]{a + " " + b + " " + Arrays.toString(v)}));
    }


    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }


}
