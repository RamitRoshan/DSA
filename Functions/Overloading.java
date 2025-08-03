package Functions;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun(5);
//        fun("Ramit Roshan");

//       int x =  sum(4,6);
//        System.out.println(x);

//        int y = sum(6,5,4);
//        System.out.println(y);

        demo(5,4,3);
        demo("ram", "sita");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.print("Second one: ");
        System.out.println(name);
    }

}
