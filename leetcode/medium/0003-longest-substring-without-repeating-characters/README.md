# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 93.74%)  
**Memory:** 47.9 MB (beats 38.57%)  
**Submitted:** 2026-09-07T06:05:16.086Z  

```java
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLen = 0;
        
        int[] pos = new int[128];

        int start = 0, end = 0;

        for (char ch : s.toCharArray())
        {
            start  = Math.max(start, pos[ch]);

            maxLen = Math.max(maxLen, end-start+1);

            pos[ch] = end + 1;
            
            end++;
        }

        return maxLen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)