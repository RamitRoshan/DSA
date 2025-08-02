package conditionalandloops;


import java.util.Scanner;

// Counting occurrence :-
//Input  two numbers, find that how many times second number digit is present in first number”
//Ex :-  first number = 14458
//Second number = 4
//Output = 2, because 4 is present 2 times in first number.
public class CountingOccurance {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int count = 0;
//
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int second = sc.nextInt();
//
//        while(n>0){
//           int rem = n %10;
//                if(rem == second){
//                    count++;
//                }
//                n = n/10;
//        }
//        System.out.print("The count of second number is: " + count);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second  = sc.nextInt();

        while (n>0){
            int rem = n %10;
            if(rem == second){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
