package Recursion.easy;

//product of digits => 1*3*4*2 = 24
public class DigitProduct {
    public static void main(String[] args) {
        int ans = prod(1342);
        System.out.println(ans);
    }
    public static int prod(int n){
        //base condition
        //if one digit(n%10) is remaining then return that digit
        if(n%10 == n){
            return n;
        }
        return prod(n/10) * (n%10);
    }
}
