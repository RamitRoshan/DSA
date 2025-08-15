package Functions;

public class sumOfNaturalNum {
    public static void main(String[] args) {
        int ans = sumOfNaturalNumbers(2);
        System.out.println(ans);
//        System.out.println(sumOfNaturalNumbers(2));
    }
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }
}
