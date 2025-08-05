package Functions;

import java.util.Scanner;

public class circumference_area_circle {
//    ✅ Formulas:
//    Circumference: 2 * π * r
//
//    Area: π * r²
//
//    Use Math.PI in Java for an accurate value of π.

    //Q). Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();


        circumferencecircle(radius);
    }

    public static void circumferencecircle(double radius){
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference of circle: " + circumference);
        System.out.println("Area of circle: " + area);
    }
}
