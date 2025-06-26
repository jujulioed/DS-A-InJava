package br.com.jujulioed.exercises;

import java.util.Stack;

public class CheckIfTheParenthesesAreBalanced {
    public CheckIfTheParenthesesAreBalanced() {
        String mathExpression = "(3+3)*(4+5)";
        boolean isValid = Run(mathExpression);

        System.out.println("In: " + mathExpression);
        System.out.println("Out: " + isValid);
    }


    public boolean Run(String mathExpression) {
        // Check if a mathematical expression has correctly balanced parentheses.
        Stack<Character> myStack = new Stack<Character>();

        for (var character : mathExpression.toCharArray()) {
            if(character == '(') {
                myStack.push(character);
            } else if (character == ')') {
                if(myStack.empty()) {
                    return false;
                }
                myStack.pop();
            }
        }

        return myStack.empty();
    }
}
