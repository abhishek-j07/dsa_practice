package Strings;

import java.util.Stack;

public class MaxParenthesesDepth {

    public static void main(String[] args) {

        String s = "(1+(2*3)+((8)/4))+1";
        MaxParenthesesDepth obj = new MaxParenthesesDepth();
        System.out.println(obj.maxDepth(s));
    }

    public int maxDepth(String s) {

        int ans = 0;
        int c = 0;
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        int i = 0;

        while(i < n){

            if(s.charAt(i) == '('){
                stack.push('(');
                ans++;
                c = Math.max(c, ans);
            }else if(s.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    ans--;
                }
            }

            i++;
        }

        return c;

    }
}
