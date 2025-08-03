package Functions;

public class StringExample {
    public static void main(String[] args) {
//        String str = greet();
//        System.out.println(str);

        String personalised = myGreet(" Ramit Roshan");
        System.out.println(personalised);
    }

    public static String myGreet(String name) {
        String message = "Hello" + name;
        return message;
    }

    public static String greet(){
        String greetings = "Ram ! Ram ! bhaishahab";
        return greetings;
    }
}
