package Arrays;

public class Q1 {

//    public static String reverse(){
//        String str = "java";
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        return  sb.toString();
//    }
//    public static void main(String[] args) {
//        System.out.println(reverse());
//    }

//    public static void main(String[] args) {
//        int number = 12345;
//        int sum = 0;
//
//        while(number>0){
//            int digit = number % 10;
//            sum = sum + digit;
//            number = number/10;   //removing the last number
//        }
//        System.out.println(sum);
//    }

    //Q) sum of the array
    //Q) average of the array
    public static void main(String[] args) {
        int[] arr = {60,70,80};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum  =sum + arr[i];
        }
        System.out.println(sum);

        int average = sum /arr.length;
        System.out.println(average);
    }
}
