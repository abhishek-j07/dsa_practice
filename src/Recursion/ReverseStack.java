package Recursion;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

    }

    public static void reverseStack(Stack<Integer> stack) {

        reverse(stack);

    }

    public static void reverse(Stack<Integer> stack) {

        if(stack.isEmpty()){
            return;
        }

        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack,top);

    }

    private static void insertAtBottom(Stack<Integer> stack, int top) {

        if(stack.isEmpty()){
            stack.push(top);
            return;
        }

        int t = stack.pop();
        insertAtBottom(stack,top);
        stack.push(t);
    }

}
