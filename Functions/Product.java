package Functions;

import java.util.Scanner;

public class Product {
    //Q) Define a method that returns the product of two numbers entered by user.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int guna = multiply(num1, num2);
        System.out.println( "the product of two numbers entered by user: " + guna);

    }
    public static int multiply(int a, int b){
      return a * b;
    }
}
