package org.example;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Challenge
        //Implement a Java program to check whether a given word is a palindrome
        //(i.e., it reads the same forward and backward).
        //However, you must use a Stack and a Queue to perform the check.
        //You are not allowed to use built-in string reversing methods.

        String input = "Omississimo";

        Queue<Character> wordQueue = new LinkedList<Character>();
        Stack<Character> wordStack = new Stack<Character>();

        for (var letter : input.toCharArray()) {
            wordQueue.add(letter);
            wordStack.add(letter);
        }

        while (!wordStack.isEmpty()) {
            if (Character.toLowerCase(wordStack.pop()) != Character.toLowerCase(wordQueue.poll())) {
                System.out.println("Is not a palindrome");
                return;
            }
        }

        System.out.println("Is a palindrome");
    }
}