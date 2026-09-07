# Distinct Subsequences II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string s, return  *the number of  **distinct non-empty subsequences**  of*  `s`. Since the answer may be very large, return it  **modulo**  `109 + 7`.

A  **subsequence**  of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"abcde"` while `"aec"` is not.

 

 **Example 1:** 

```
Input: s = "abc"
Output: 7
Explanation: The 7 distinct subsequences are "a", "b", "c", "ab", "ac", "bc", and "abc".

```

 **Example 2:** 

```
Input: s = "aba"
Output: 6
Explanation: The 6 distinct subsequences are "a", "b", "ab", "aa", "ba", and "aba".

```

 **Example 3:** 

```
Input: s = "aaa"
Output: 3
Explanation: The 3 distinct subsequences are "a", "aa" and "aaa".

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.3 MB  
**Submitted:** 2026-09-07T05:29:05.453Z  

```java
class Solution {
    public int distinctSubseqII(String s) {
        int n = s.length();
        int MOD = (int) 1e9 + 7;

        int[] countEndWith = new int[26];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';

            int cur = (int) ((1L + sum - countEndWith[idx] + MOD) % MOD);

            sum = (sum + cur) % MOD;

            countEndWith[idx] = (countEndWith[idx] + cur) % MOD;
        }

        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/distinct-subsequences-ii/)