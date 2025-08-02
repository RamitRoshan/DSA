package Functions;

import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'.
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        int c = fact(a);
        System.out.println(c);
    }

    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
}
