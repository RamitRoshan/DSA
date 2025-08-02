package conditionalandloops;

public class Perfect_Number {
    /* Q). Perfect Number In Java
    A Perfect Number is a positive integer that is equal to the sum of its proper positive divisors, excluding the number itself.
            Example:
            6 → divisors: 1, 2, 3 → sum = 1 + 2 + 3 = 6 ✅

            28 → divisors: 1, 2, 4, 7, 14 → sum = 28 ✅

     */

    public static void main(String[] args) {
        int num =28;
        int sum = 0;

        for(int i=1; i<=num/2; i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println(num + " is a Perfect number");
        }else{
            System.out.println(num + " is not a Perfect number");
        }
    }
}






