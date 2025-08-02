package Functions;

import java.util.Scanner;
//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();

        int x = palindrome(a);
        System.out.print(x);
    }
    public static int palindrome(int n){
        int original = n;
        int reverse = 0;
        while(n>0){
            int rem = n %10;
            reverse = reverse*10 + rem;
            n = n/10;
        }

        if(original == reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
        return reverse;
    }
}
