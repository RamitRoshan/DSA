package Recursion.easy;

//sum of 5 number that is: 5+ 4+ 3+ 2+ 1 = 15
public class Sum {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }
    public static int sum(int n){
        //base condition
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
}
