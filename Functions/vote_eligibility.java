package Functions;

public class vote_eligibility {

    // Q) A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out
    // if he/she is eligible to vote.
    public static void main(String[] args) {
        castVote(22);
    }
    public static void castVote(int age){
        if(age >= 18){
            System.out.println("He and She both are eligible to caste vote");
        }else {
            System.out.println("Both are not eligible for caste vote, you have to wait till age 18...");
        }
    }
}
