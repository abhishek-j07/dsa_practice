package Recursion;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {

    }

    public static void sortStack(Stack<Integer> stack) {

        if(stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        sortStack(stack);
        insert(stack,top);
    }

    public static void insert(Stack<Integer> stack, int num) {

        if(stack.isEmpty() || num > stack.peek()) {
            stack.push(num);
            return;
        }

        int top = stack.pop();
        insert(stack, num);

        stack.push(top);
    }
}
