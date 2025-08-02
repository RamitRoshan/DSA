package conditionalandloops;

import java.util.Scanner;

public class SumUntilZero {

    //Q).Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int sum = 0;
//        while(true){
//            System.out.print("Enter the number: ");
//            int c = sc.nextInt();
//            if (c == 0) {
//                break;
//            }
//            sum = sum + c;
//        }
//        System.out.print("The total sum is : " + sum);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true){
            System.out.print("Enter the number till you enter 0: ");
            int c = sc.nextInt();

            //condition
            if(c==0){
                break;
            }
            sum = sum + c;
        }
        System.out.print("The sum of all entered number is: "+ sum);
    }
}
