package br.com.jujulioed;

import br.com.jujulioed.exercises.InvertAString;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Resume
        // stack =  LIFO data structure. Last-in First-Out
        //          stores objects into a sort of "vertical tower"
        //          push() to add to the top
        //          pop() to remove from the top

        Stack<String> gameStack = new Stack<String>();

        // We have five unique methods available for stacks
        // push() - to add an object to the top of the stack
        // pop() - to remove the object on the top of the stack and return it
        // peek() - to return the object on the top of the stack without removing it
        // empty() - to retrieve if the stack is empty
        // search(object) - to return the position of the object where the top of the stack is the index 1 and the bottom is the largest number

        System.out.println(gameStack.empty());

        gameStack.push("Minecraft");
        gameStack.push("Final Fantasy");
        gameStack.push("Doom");
        gameStack.push("League of Legends");
        gameStack.push("Firewatch");

        System.out.println(gameStack.empty());

        System.out.println(gameStack);


        String myFavGame = gameStack.peek();
        System.out.println(myFavGame);

        System.out.println(gameStack.peek());
        System.out.println(gameStack.search("Minecraft"));

        // This will generate a "OutOfMemoryError: Java heap space"
//        for(long i = 0; i < 100000000000L; i++) {
//            gameStack.push("Fallout 76");
//        }


        // Use of the stacks?
        // 1. undo/redo features in text editors;
        // 2. moving back/forward through browser history;
        // 3. backtracking algorithms (maze, file directories);
        // 4. calling functions (call stack);


        System.out.println("Exercise 1 ----------------");
        System.out.println("Invert a String");
        new InvertAString();

    }
}