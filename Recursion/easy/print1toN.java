package Recursion.easy;

public class print1toN {
    public static void main(String[] args) {
        fun(10);
    }
    public static void fun(int n){

        //base condition
        if(n==0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
