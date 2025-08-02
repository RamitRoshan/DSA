package conditionalandloops;

import java.util.Scanner;

public class Factorial {

    //Q) Input a number and print all the factors of that number (use loops).
//     public static void main(String args[]){
//
//         int n = 3;
//         int fact = 1;
//
//         for(int i=1; i<=n; i++){
//             fact = fact * i;
//         }
//         System.out.println(fact);
//     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.print( "Factorial of " + num + " is: " + fact);
    }
}
