package Recursion.easy;
//Q). sum of digits. N=1342, ans = 1 + 3 + 4 + 2 = 10

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(1432);
        System.out.println("Sum of digits: " + ans);
    }
    public static int sum(int n){
        //base condition
        if(n == 0){
            return 0;
        }
        return sum(n/10) + (n%10);
    }
}
