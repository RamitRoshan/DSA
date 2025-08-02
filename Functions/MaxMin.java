package Functions;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();

        System.out.print("Enter the number 3: ");
        int c = sc.nextInt();

        int maxi = maximum(a,b,c);
        System.out.println("The maximum number among three is: " + maxi);

        int mini = minimum(a,b,c);
        System.out.println("The minimum number is : " + mini);
    }
    public static int maximum(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c> max){
            max = c;
        }
        return max;
    }

    public static int minimum(int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }
}
