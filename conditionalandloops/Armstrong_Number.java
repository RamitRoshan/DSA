package conditionalandloops;

public class Armstrong_Number {

    //Q). Armstrong Number In Java
//    public static void main(String[] args) {
//        int num = 158;
//        int original  =num;
//        int result = 0;
//        while (num>0){
//            int rem = num % 10;
//            int arm = rem * rem * rem;
//            result = result+ arm;
//            num = num/10;
//        }
//        if(result == original){
//            System.out.println(original + " is an armstring number");
//        }else{
//            System.out.println(original + " is not an armstrong number");
//        }
//    }

    public static void main(String[] args) {
        //find armstrong number
        int n = 153;
        int original = n;

        int result = 0;

        while(n>0){
            int rem = n % 10;
            int arms = rem * rem * rem;
            result= result + arms;
            n = n/10;
        }
        if(original == result){
            System.out.println(original + " is an armstrong number");
        }else{
            System.out.println(original + "is not an armstrong number");
        }
    }
}
