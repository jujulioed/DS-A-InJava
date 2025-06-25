package br.com.jujulioed.exercises;

import java.util.Stack;

public class InvertAString {

    public InvertAString() {

        // Given a string, use a stack to reverse the characters in it.
        String word = "hello";
        StringBuilder invertedWord = new StringBuilder();

        Stack<Character> chars = new Stack<Character>();
        for(var letter : word.toCharArray()) {
            chars.push(letter);
        }

        while(!chars.empty()) {
            invertedWord.append(chars.pop());
        }

        System.out.println("In: " + word);
        System.out.println("Out: " + invertedWord);
    }
}
