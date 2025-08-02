package Functions;


import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a
// method to find out if he/she is eligible to vote.
public class VoteAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n = sc.nextInt();
        vote(n);
    }
    public static void vote(int age){
        if(age >= 18){
            System.out.println("He/She can vote");
        }else{
            System.out.println("He/She cannot vote");
        }
    }
}
