package conditionalandloops;

import java.util.Scanner;

public class AddTwoNumber {

    //Q). Addition Of Two Numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = sc.nextInt();

        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        int sum = x + y;
        System.out.print("The sum of both numbers is : "+ sum);
    }
}
