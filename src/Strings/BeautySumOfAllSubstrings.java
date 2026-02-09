package Strings;

public class BeautySumOfAllSubstrings {

    public static void main(String[] args) {

        String s = "aabcb";
        BeautySumOfAllSubstrings beautySum = new BeautySumOfAllSubstrings();
        System.out.println(beautySum.beautySum(s));
    }

    public int beautySum(String s) {

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for(int j = i; j < s.length(); j++) {

                char c =  s.charAt(j);
                freq[c - 'a']++;

                int beauty = getMax(freq) - getMin(freq);
                sum += beauty;
            }
        }

        return sum;
    }

    public int getMax(int[] freq) {

        int max = Integer.MIN_VALUE;

        for(Integer i : freq) {
            if(i != 0) {
                max = Math.max(max, i);
            }
        }

        return max;
    }

    public int getMin(int[] freq) {

        int min = Integer.MAX_VALUE;
        for(Integer i : freq) {
            if(i != 0) {
                min = Math.min(min, i);
            }
        }
        return min;
    }
}
