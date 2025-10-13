package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Fibonacci number of n is: "  );
        System.out.println(fibo(6));
    }
    public static int fibo(int n){
        //base condition i.e if n is 1 = return 1 and same for 0
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
