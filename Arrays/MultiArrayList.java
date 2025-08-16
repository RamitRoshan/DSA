package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //multi-dimentional ArrayList (ArrayList of ArrayList, type Integer)
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        //if we don't initialize, then by default the value of every single index is going to be null(or give error).
        for (int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
