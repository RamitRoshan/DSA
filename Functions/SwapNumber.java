package Functions;

public class SwapNumber {
    public static void main(String[] args) {
         swap(3,4);
    }


    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
//        System.out.println(a + b);

        System.out.println("After swap: a = " + a + ", b = " + b);

    }
}
