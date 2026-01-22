package Strings;

public class ReverseWord {

    public static void main(String[] args) {

        String s = "  hello world  ";
        ReverseWord rw = new ReverseWord();
        System.out.println("'" + rw.reverseWords(s) + "'");
    }

    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;

        while(i >= 0){

            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            if(i < 0){
                break;
            }

            int end = i;

            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            if(sb.isEmpty()){
                sb.append(s.substring(i+1,end+1));
            }else{
                sb.append(" " + s.substring(i+1,end+1));
            }


        }

        return sb.toString();
    }

}
