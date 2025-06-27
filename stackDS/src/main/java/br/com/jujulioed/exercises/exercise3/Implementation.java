package br.com.jujulioed.exercises.exercise3;

public class Implementation {
    public Implementation() {

        // Exercise 3: Implement your own Stack with Array
        // Implement a class called MyStack with the following operations:
        // push(int value)
        // pop()
        // peek()
        // isEmpty()
        // isFull() (assume a maximum size)
        // Then, use this stack to store and manipulate integers.
        MyStack ms = new MyStack(10);

        ms.push(15);
        ms.push(12);
        ms.push(10);



        System.out.println(ms.pop());
    }
}
