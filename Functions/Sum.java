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
//        int sum = 0;
        int sum = a+b;
        System.out.print("The sum of both the numbers is: "+ sum);
    }



//    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println("The sum is: " + ans);
//    }
//
//    //return the value
//    public static int sum2(){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number 1: ");
//        int num1 = sc.nextInt();
//
//        System.out.print("Enter number 2: ");
//        int num2 = sc.nextInt();
//        int sum = num1 + num2;
//        return sum;
//
//    }


    //pass the value of numbers when you are calling the method in main()
//    public static void main(String[] args) {
//        int ans = sum3(20,30);
//        System.out.println(ans);
//    }
//    static int sum3(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
}
