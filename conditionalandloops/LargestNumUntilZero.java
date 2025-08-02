package conditionalandloops;

import java.util.Scanner;

public class LargestNumUntilZero {
    //Q). Take integer inputs till the user enters 0 and print the largest number from all.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int largest = 0;
        int largest = Integer.MIN_VALUE;
        while (true){
            System.out.print("Enter the number till you enter 0: ");
            int z = sc.nextInt();

            if (z == 0){
                break;
            }

            if(z> largest){
                largest = z;
            }
        }
        System.out.print("The largest number is: " + largest);
    }
}
