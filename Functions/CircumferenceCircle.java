package Functions;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
//Area=π×radius2
//Circumference=2×π×radius
public class CircumferenceCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your radius: ");
        int a = sc.nextInt();
        circle(a);

        System.out.print("Enter your radius for circumference: ");
        int b = sc.nextInt();
        circumference(b);
    }
    public static void circle(int r){
        float area =  3.14f * r*r;
        System.out.println("The area of circle is: "+ area);

    }
    public static void circumference(int r){
        float circum = 2* 3.14f * r;
        System.out.print("Circumference is: "+ circum);

    }
}
