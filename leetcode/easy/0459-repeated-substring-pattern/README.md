# Repeated Substring Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

 

 **Example 1:** 

```
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

```

 **Example 2:** 

```
Input: s = "aba"
Output: false

```

 **Example 3:** 

```
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 99.32%)  
**Memory:** 46.4 MB (beats 91.09%)  
**Submitted:** 2026-09-07T06:22:15.793Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/repeated-substring-pattern/)