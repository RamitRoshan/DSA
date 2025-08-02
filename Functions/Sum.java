package Functions;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();

        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        sumTwo(a,b);
    }

    public static void sumTwo(int a, int b){
        int sum = 0;
        sum = a+b;
        System.out.print("The sum of both the numbers is: "+ sum);
    }
}
