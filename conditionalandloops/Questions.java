package conditionalandloops;

import java.util.Scanner;

public class Questions {

    //Q1). Calculate Average Of N Numbers
//    public static void main(String[] args) {
//        int[] num = {3,4,5,7,8,12,45};
//        int sum = 0;
//
//        for(int i=0; i<num.length; i++){
//            sum = sum+ num[i];
//        }
//        double avg = (double)sum / num.length;
//        System.out.println(avg);
//    }

    //Q2). Calculate Commission Percentage
//    public static void main(String[] args) {
//        int sales = 10000;
//        int commision  = 5000;
//
//        double CP = ((double) commision/sales) *100;
//        System.out.println("Commission Percentage = " + CP + "%");
//    }

    //Q3) Power in java
//    public static void main(String[] args) {
//        int a = 3;
//        int b = 2;
//        int power = (int)Math.pow(b,a);
//        System.out.println(power);
//    }

    //Q4). Calculate CGPA Java Program
//    public static void main(String[] args) {
//        int[] marks = {90,67,45,90};
//        int sum = 0;
//        for(int i=0; i<marks.length; i++){
//            sum = sum + marks[i];
//        }
//        double cgpa = sum/(double)marks.length;
//        System.out.println(cgpa);
//    }

    //Q5). Calculate sum of n number
//    public static void main(String[] args) {
//        int[] num = {23,2,5,6,2,1};
//        int sum  = 0;
//        for (int i=0; i<num.length; i++){
//            sum = sum + num[i];
//        }
//        System.out.println(sum);
//    }

    //Q6) Find Ncr & Npr (NCR Combination)
//    public static void main(String[] args) {
//        int n =4;
//        int fact1 = 1;
//        int r = 3;
//        int fact2 = 1;
//
//        int fact3 = 1; //(n-r)
//
//        for(int i=1; i<=n; i++){
//            fact1 = fact1 *i;
//        }
//        for(int i=1; i<=r; i++){
//            fact2 = fact2*i;
//        }
//        for(int i=1; i<=(n-r); i++){
//            fact3 = fact3*i;
//        }
//
//        int ncr = fact1/(fact2 * fact3);
//        System.out.println(ncr);
//
//        int npr = fact1/fact3;
//        System.out.println(npr);
//    }

    //Q7). Future Investment Value
//    public static void main(String[] args) {
//        int principle = 10000;
//        int n = 5;
//        double r = 0.08;
//        double sum = (1+r);
//        double FIV = principle * Math.pow(sum,n);
//        System.out.println(FIV);
//    }

    //Q8). Sum Of A Digits Of Number
//    public static void main(String[] args) {
//        int number = 538;
//        int sum = 0;
//
//        while (number>0){
//            int digit = number%10;
//            sum = sum + digit;
//            number = number/10;
//        }
//        System.out.println(sum);
//    }

    /* Q9). Kunal is allowed to go out with his friends only on the even days of a given month.
         Write a program to count the number of days he can go out in the month of August. */
//    public static void main(String[] args) {
//        int august = 31;
//        int count = 0;
//
//        for(int day =1; day<=august; day++){
//            if(day % 2 ==0){
//                count = count +1;
//            }
//        }
//        System.out.println("Kunal can go out on " + count + " days.");
//    }

    /*
    Q10). Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive,
     odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sumEven = 0;
        int sumOdd = 0;
        int sumNegative = 0;

        while(true){
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if(n == 0){
                break;
            }

            if(n <  0){
                sumNegative = sumNegative + n;
            } else if (n % 2 == 0) {
                sumEven = sumEven +n;
            } else {
                sumOdd = sumOdd + n;
            }

        }
        System.out.println("Final Sum of Negative numbers: " + sumNegative);
        System.out.println("Final Sum of Even numbers: " + sumEven);
        System.out.println("Final Sum of Odd numbers: " + sumOdd);

    }


}
