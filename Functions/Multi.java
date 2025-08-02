package Functions;

import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the first number: ");
        int y = sc.nextInt();
        multiplication(x,y);
    }

    public static void multiplication(int a, int b){
        int mul = 1;
        mul = a * b;
        System.out.print("Multiplication of both the numbers is: " + mul);
    }
}
