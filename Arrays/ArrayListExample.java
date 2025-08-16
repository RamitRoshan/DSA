package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(11);
//        list.add(334);
//        list.add(45);
//        list.add(56);
//        list.add(77654);
//        list.add(111);

        //System.out.println(list);
//        System.out.println(list.contains(111)); //true
//
//        list.set(4, 121);
//
//        list.remove(2);
//        System.out.println(list);

        //input
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }

        //get item at any index
        for(int i=0; i<5; i++){
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }

        System.out.println(list);
    }
}
