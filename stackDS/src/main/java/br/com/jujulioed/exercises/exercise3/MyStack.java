package br.com.jujulioed.exercises.exercise3;

public class MyStack {
    private int top = -1;
    private final int size = 10;
    private final int[] numbersStack = new int[size];

    public MyStack() {}

    public void push(int value) {
        if (!this.isFull()) {
            this.top++;
            this.numbersStack[this.top] = value;
            return;
        }
        throw new RuntimeException("Stack full filled");
    }

    public int pop() {
        if(this.isEmpty()) {
            int value = this.numbersStack[this.top];
            this.top--;
            return value;
        }
        throw new RuntimeException("Stack empty");
    }

    public int peek() {
        if(this.isEmpty()) {
            return this.numbersStack[this.top];
        }
        throw new RuntimeException("Stack empty");
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top + 1  == size;
    }
}
