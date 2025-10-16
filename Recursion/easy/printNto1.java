package Recursion.easy;

// N = 5, we have to print element from N to 1 (5, 4, 3, 2, 1)
public class printNto1 {
    public static void main(String[] args) {
        fun(5);
    }
    public static void fun(int n){
        //base condition
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}

//when we use  *int* in place of void

//package Recursion;

//public class printNto1 {
//    public static void main(String[] args) {
//        fun(5);
//    }
//
//    public static int fun(int n){
//        // Base condition
//        if(n == 0){
//            return 0; // returning 0 when done
//        }
//        System.out.println(n);
//        return fun(n - 1); // recursively call and return value
//    }
//}

