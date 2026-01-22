package Strings;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"flg","flw","flx"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(arr));
    }

    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < strs[0].length(); i++){

            for(String s : strs){

                if(i == s.length() || s.charAt(i) != strs[0].charAt(i)){
                    return sb.toString();
                }
            }

            sb.append(strs[0].charAt(i));

        }

        return sb.toString();
    }
}
