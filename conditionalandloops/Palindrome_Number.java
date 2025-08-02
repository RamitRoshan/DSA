package conditionalandloops;

public class Palindrome_Number {
    //Q). Find if a number is palindrome or not

    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int palin = 0;
        while(num>0){
            int rem = num%10;
            palin = (palin * 10) + rem;
            num  =  num/10;
        }
        if(original == palin){
            System.out.print(original + " is a Palindrome number");
        }else {
            System.out.print(original + " is not a Palindrome number");
        }
    }

}
