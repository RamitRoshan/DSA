package conditionalandloops;

import java.util.Scanner;

public class Vowel_Consonant {
    //Q). Java Program Vowel Or Consonant
//    public static void main(String[] args) {
//        char ch = 'b';
//
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ||
//                ch =='A' || ch == 'E' || ch == 'I' || ch=='O' || ch== 'U'){
//            System.out.println( ch+ " is a vowels");
//        }else{
//            System.out.println(ch + " is Consonant");
//        }
//
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ||
                ch =='A' || ch == 'E' || ch == 'I' || ch=='O' || ch== 'U'){
            System.out.println(ch + " is a vowels");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant");
        } else {
            System.out.println("Not a letter");
        }
    }
}


