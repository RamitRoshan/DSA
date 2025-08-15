package Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(334);
        list.add(45);
        list.add(56);
        list.add(77654);
        list.add(111);

        System.out.println(list);

        System.out.println(list.contains(111)); //true
    }
}
