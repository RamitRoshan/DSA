package Recursion.medium;

public class Reverse {

    static int sum = 0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int remainder = n % 10;
        sum = sum * 10 + remainder;
        rev1(n/10);
    }
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
    }
}
