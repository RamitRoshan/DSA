package Functions;

public class PalindromeNo {
    //Q)  Write a function to find if a number is a palindrome or not. Take number as parameter.

//    public static void main(String[] args) {
//
//
//       int reverse = ispalindrome(121);
//        System.out.println("Reversed number is: "+ reverse);
//
//    }
//    public static int ispalindrome(int number){
//        int rev = 0;
//        int original = number;
//        while(number>0){
//            int rem = number % 10;
//            rev = rev *10 + rem;
//            number = number/10;
//        }
//        if(original == rev){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("Not palindrome");
//        }
//        return rev;
//    }


    public static void main(String[] args) {

        int rev = isPalindrome(123);
        System.out.println("Reverse number is: "+ rev);
    }

    public static int isPalindrome(int number){
        int reverse = 0;
        int original = number;

        while (number>0){
            int rem = number %10;
            reverse = reverse *10 + rem;
            number = number/10;
        }

        if(original == reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        return reverse;
    }
}
