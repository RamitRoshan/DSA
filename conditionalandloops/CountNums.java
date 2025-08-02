package conditionalandloops;



//Reverse A String In Java


//print how many times 7 is there like 7 is 3 times so output should be 3
public class CountNums {
    public static void main(String[] args) {

//        int n = 2345;
//
//        int count = 0;
//
//        while(n>0){
//            int rem = n%10;
//            if(rem == 5){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println("5 is " + count + " times");


        int n = 45536;

        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem == 5){
                count++;
            }
            n = n/10;
        }
        System.out.println("count of 5 is: " + count);
    }
}
