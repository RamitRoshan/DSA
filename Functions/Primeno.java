package Functions;

import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =  sc.nextInt();
        System.out.println(" It is " +isPrime(n));
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%2 == 0){
                return  false;
            }
        }
        return true;
    }
}
