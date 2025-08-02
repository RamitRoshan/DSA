package Functions;

public class EvenOdd {
    public static void main(String[] args) {

        check(110);
    }
    public static int check(int n){
        if(n % 2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        return n;
    }
}
