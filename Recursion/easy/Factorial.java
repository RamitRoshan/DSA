package Recursion.easy;

public class Factorial {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println("The factorial of given number is: " +ans);
    }
    public static int fact(int n){
        //base conditions
        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
