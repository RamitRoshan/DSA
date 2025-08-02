package Functions;

import java.util.Scanner;

//Write a function that returns the sum of first n natural numbers.
public class Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int x = sc.nextInt();
        int a = natural(x);
        System.out.println(a);
    }

    public static int natural(int n){
        int sum = 0;
        sum = n*(n+1)/2;
        return sum;
    }
}
