package Recursion.medium;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(302010));
    }

    public static int count(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int remainder = n % 10;
        if(remainder == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
