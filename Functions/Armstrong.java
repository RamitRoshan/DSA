package Functions;

import java.util.Scanner;

//153
public class Armstrong {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//        System.out.println(isArms(n));
//    }
//    public static boolean isArms(int n){
//        int original = n;
//        int sum = 0;
//
//        while (n>0){
//            int rem = n %10;
//            n = n/10;
//            int cube = rem*rem*rem;
//            sum = sum + cube;
//
//        }
//        if(sum == original){
//            return true;
//        }
//        return false;
//    }

    public static void main(String[] args) {
        int n = 153;
        int original  = n;
        int sum = 0;

        while (n>0){
            int rem = n %10;
            sum = sum + rem * rem *rem;
            n = n/10;
        }
        if(original == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }
    }
}
