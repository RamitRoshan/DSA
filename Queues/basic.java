package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class basic {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Printing elements of Queue: " + q);
        System.out.println("Size of ele. in Queue: " + q.size());

        System.out.println(q.remove()); //1 first-in-first-out
        System.out.println(q);

        //getting top ele, as first-in-first-out
        System.out.println("Peek/Top ele. of current queue is:  " + q.peek());

    }
}
