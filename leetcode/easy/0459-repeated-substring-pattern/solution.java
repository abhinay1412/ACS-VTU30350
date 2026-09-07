class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length(), prevLPS = 0, i = 1;
        int[] lps = new int[n];
        while (i < n) {
            if (s.charAt(i) == s.charAt(prevLPS)) {
                lps[i++] = ++prevLPS;
            } else if (prevLPS == 0) {
                lps[i++] = 0;
            } else {
                prevLPS = lps[prevLPS - 1];
            }
        }
        return lps[n - 1] > 0 && n % (n - lps[n - 1]) == 0;
    }
}