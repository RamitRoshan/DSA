package Functions;


//Write a function that returns all prime numbers between two given numbers.
public class PrimebtwTwoNumber {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter  your number: ");
//        int x = sc.nextInt();
//        boolean bo = isPrime(x);
//        System.out.println(bo);
//    }
//    public static boolean isPrime(int n){
//
//        if(n<= 1){
//            return false;
//        }
//        for(int i=2; i<=Math.sqrt(n); i++){
//            if(n %i == 0){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        boolean p = isPrime(3);
        System.out.println(p);
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=n; i++){
            if(n % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
