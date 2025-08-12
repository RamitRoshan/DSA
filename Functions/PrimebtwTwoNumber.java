package Functions;


//Write a function that returns all prime numbers between two given numbers.
public class PrimebtwTwoNumber {

    public static void main(String[] args) {
         int a = 10, b=14;
        System.out.print("The prime numbers btw given range is: ");
         primeRange(a,b);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }
    //check prime number btw given ranges
    public static void primeRange(int a, int b){
//        for(int i=a; i<=b; i++){
//            if(isPrime(i)){
//                System.out.print(i + " ");
//            }
//        }
        //Added Math.min(a, b) and Math.max(a, b) so the range works even if inputs are swapped
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
