package SlidingWindowTwoPointer;

public class SubstringContainingAll3Characters {

    public static void main(String[] args) {

    }

    public int numberOfSubstrings(String s) {

        int c = 0;

        int[] lastSeen = new int[3];

        for(int i = 0 ; i < 3 ; i++){
            lastSeen[i] = -1;
        }

        int n = s.length();

        for(int i = 0; i < n; i++){

            lastSeen[s.charAt(i) - 'a'] = i;

            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){

                c += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1],lastSeen[2]));
            }
        }

        return c;
    }
}
