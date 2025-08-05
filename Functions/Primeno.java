package Functions;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number=  sc.nextInt();

        boolean c  = isPrime(number);
        System.out.println(c);
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
