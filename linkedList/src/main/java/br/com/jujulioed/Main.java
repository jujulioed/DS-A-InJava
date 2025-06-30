package br.com.jujulioed;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        // using linked list as a stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();

        // using linked list as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        //linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("E");
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();


        System.out.println(linkedList);


    }
}