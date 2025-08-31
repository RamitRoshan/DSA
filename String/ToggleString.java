package String;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args){

        /*
        Q) Toggle all the characters of the string that is To Convert UpperCase to LowerCase and ViceVersa.
        */
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        for(int i=0; i<str.length(); i++){
            boolean flag = true;

            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            int ascii = (int)ch;
            if(ascii >= 97) flag = false;

            if(flag == true){
                ascii += 32;
                char dh = (char) ascii;
                str.setCharAt(i,dh);
            }else{
                ascii -= 32;
                char dh = (char) ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
