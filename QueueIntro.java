package com.blit.day9;

import java.util.PriorityQueue;

public class QueueIntro {

    public static void main(String[] args) {

//        Queue:
//        FIFO - Queue follow First in First out
//        Queue keep the insertion order

        PriorityQueue <Integer> q1 = new PriorityQueue<>();
        q1.offer(12);
        q1.offer(24);
        q1.offer(36);
        q1.offer(48);
        System.out.println(q1);
        System.out.println(q1.peek()); // check the first element in the collection
        q1.poll(); // removing the first element from the collection
        System.out.println(q1);

    }

}
