package conditionalandloops;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;

        for(int i=1; i<=n; i++){
            System.out.print(a+ " ");

            int next = a+b;
            a = b;
            b = next;
        }
    }
}
