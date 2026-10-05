import java.util.Arrays;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        Arrays.fill(mapS, -1);
        Arrays.fill(mapT, -1);

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapS[a] != -1 && mapS[a] != b) {
                return false;
            }

            if (mapT[b] != -1 && mapT[b] != a) {
                return false;
            }

            mapS[a] = b;
            mapT[b] = a;
        }

        return true;
    }
}