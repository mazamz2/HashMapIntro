package com.blit.day9;
// adding comment to add change
import java.util.ArrayDeque;

public class DequeIntro {

    public static void main(String[] args) {
//        Double Ended Queue - Deque:
//        Elements can be added or removed from the both ends (start, end)

        ArrayDeque <Integer> q2 = new ArrayDeque<>();
        q2.offer(10);
        q2.offer(20);
        q2.offer(30);
        q2.offer(100);
        q2.offer(60);
        q2.offer(50);
        q2.offer(70);
        System.out.println(q2);
        System.out.println(q2.peek()); // by default peeking first element
        System.out.println(q2.peekFirst()); // peeking first element
        System.out.println(q2.peekLast()); // peeking last element
        q2.poll(); // removing first element
        System.out.println(q2);
        q2.removeFirst(); // removing first element, can use poll or remove method
        System.out.println(q2);
        q2.pollLast(); // removing last element
        System.out.println(q2);



    }
}
