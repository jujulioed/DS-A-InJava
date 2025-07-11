package br.com.jujulioed;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Priority Queue =     A FIFO data structure that server elements
        //                      with the highest priorities first
        //                      before elements with lower priority

        // So we can say that PriorityQueue is a Queue that we sort first

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}