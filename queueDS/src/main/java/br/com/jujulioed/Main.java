package br.com.jujulioed;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queue =  FIFO data structure. First-In First-Out (ex. A line of people)
        //          A collection designed for holding elements prior to processing Linear data structure

        //          add()       = enqueue, offer()      - To add an object to the queue
        //          remove()    = dequeue, poll()       - To remove the first object of the queue and return it
        //          element()   = peek()                - To return the first object fo the queue without removing it

        // The first object of the queue is the head
        // The last object of the queue is the tail

        // Since queue is an interface from java, we can't instantiate it, we need to use a class that implements it.
        // Then we will use Linked List.
        Queue<String> queue = new LinkedList<String>();

        // Since Queue extend Collection, we have all the methods for it to use


        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // This method come from Collection
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());
        // It returns true or faLse
        //System.out.println(queue.contains("Steve"));

        System.out.println(queue.peek());
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();


        // poll, offer and peek don't throw exceptions
        System.out.println(queue);


        // Where are queues useful?

        // 1. Keyboard buffer(letters should appear on the screen in the order they're pressed)
        // 2. Printer queue (Print jobs should be completed0,
        // 3. Used in LinkedLists, PriorityQueue, Breadth-first and search algorithms
    }
}