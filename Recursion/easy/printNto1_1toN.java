package Recursion.easy;

//Print numbers from 1 to N and from N to 1..

public class printNto1_1toN {
    public static void main(String[] args) {
        funBoth(5);
    }

    //print N to 1
    public static void fun(int n){
        //base condition
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    //print 1 to N
    public static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    //combining both here
    public static void funBoth(int n){
        //base condition
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
