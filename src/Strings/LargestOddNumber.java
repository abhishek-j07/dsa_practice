package Strings;

public class LargestOddNumber {

    public static void main(String[] args) {

        String qes = "40";

        LargestOddNumber l = new LargestOddNumber();
        System.out.println(l.largestOddNumber(qes));
    }

    public String largestOddNumber(String num) {

        int i = num.length() - 1;
        StringBuilder sb = new StringBuilder();

        while(i >= 0){

            if(Integer.parseInt(String.valueOf(num.charAt(i))) % 2 != 0){
                return num.substring(0, i+1);
            }

            i--;
        }

        return sb.toString();
    }
}
