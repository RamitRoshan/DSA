package Searching;

public class SearchString {

    public static boolean searchString(String str, char target){
        if(str.length() == 0) return false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "Raju bike";
        char target = 'i';

        //String.valueOf() is used to convert different data types into a String.
//        String result = String.valueOf(searchString(name, target));  //

        System.out.println(searchString(name, target));

    }
}
