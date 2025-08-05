package Functions;

import java.util.Scanner;

public class Maximum_Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int max = maximum(a,b,c);
        System.out.println("Maximum number among three is: " + max);

        int min = minimum(a,b,c);
        System.out.println("Minimum number among three is: " + min);


    }

    public static int maximum(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }

    public static int minimum(int a, int b, int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
