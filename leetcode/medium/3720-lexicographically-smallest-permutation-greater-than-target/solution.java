class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch : target.toCharArray()) {
            count[ch - 'a']--;
        }

        for (int i = target.length() - 1; i >= 0; i--) {
            int current = target.charAt(i) - 'a';

            count[current]++;

            boolean canFormPrefix = true;

            for (int freq : count) {
                if (freq < 0) {
                    canFormPrefix = false;
                    break;
                }
            }

            if (!canFormPrefix) {
                continue;
            }

            int next = -1;

            for (int c = current + 1; c < 26; c++) {
                if (count[c] > 0) {
                    next = c;
                    break;
                }
            }

            if (next == -1) {
                continue;
            }

            count[next]--;

            StringBuilder answer = new StringBuilder();

            answer.append(target, 0, i);
            answer.append((char) ('a' + next));

            for (int c = 0; c < 26; c++) {
                while (count[c] > 0) {
                    answer.append((char) ('a' + c));
                    count[c]--;
                }
            }

            return answer.toString();
        }

        return "";
    }
}