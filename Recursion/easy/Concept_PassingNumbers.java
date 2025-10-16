package Recursion.easy;

public class Concept_PassingNumbers {
    public static void main(String[] args) {
        func(5);
    }
    public static void func(int n){
        //base condition
        if(n == 0){
            return;
        }
        System.out.println(n);
        func(--n);
    }
}
