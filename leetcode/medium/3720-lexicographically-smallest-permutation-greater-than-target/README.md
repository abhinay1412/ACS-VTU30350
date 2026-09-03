# Lexicographically Smallest Permutation Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two strings `s` and `target`, both having length `n`, consisting of lowercase English letters.

Return the  **lexicographically smallest permutation**  of `s` that is  **strictly**  greater than `target`. If no permutation of `s` is lexicographically strictly greater than `target`, return an empty string.

A string `a` is  **lexicographically strictly greater** than a string `b` (of the same length) if in the first position where `a` and `b` differ, string `a` has a letter that appears later in the alphabet than the corresponding letter in `b`.

 

 **Example 1:** 

 **Input:**  s = "abc", target = "bba"

 **Output:**  "bca"

 **Explanation:** 

- The permutations of s (in lexicographical order) are "abc", "acb", "bac", "bca", "cab", and "cba".
- The lexicographically smallest permutation that is strictly greater than target is "bca".

 **Example 2:** 

 **Input:**  s = "leet", target = "code"

 **Output:**  "eelt"

 **Explanation:** 

- The permutations of s (in lexicographical order) are "eelt", "eetl", "elet", "elte", "etel", "etle", "leet", "lete", "ltee", "teel", "tele", and "tlee".
- The lexicographically smallest permutation that is strictly greater than target is "eelt".

 **Example 3:** 

 **Input:**  s = "baba", target = "bbaa"

 **Output:**  ""

 **Explanation:** 

- The permutations of s (in lexicographical order) are "aabb", "abab", "abba", "baab", "baba", and "bbaa".
- None of them is lexicographically strictly greater than target. Therefore, the answer is "".

 

 **Constraints:** 

- 1 <= s.length == target.length <= 300
- s and target consist of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 91.94%)  
**Memory:** 45 MB (beats 61.29%)  
**Submitted:** 2026-08-27T04:03:48.041Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/lexicographically-smallest-permutation-greater-than-target/)