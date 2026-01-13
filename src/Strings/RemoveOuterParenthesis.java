package Strings;

public class RemoveOuterParenthesis {

    public static void main(String[] args) {

        String s = "((()()))";

        RemoveOuterParenthesis sol = new RemoveOuterParenthesis();
        System.out.println(sol.removeOuterParentheses(s));

    }

    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int c = 0;

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '('){
                c++;
            }

            if(c > 1){
                sb.append(s.charAt(i));
            }

            if(s.charAt(i) == ')'){
                c--;
            }
        }

        return sb.toString();
    }
}
