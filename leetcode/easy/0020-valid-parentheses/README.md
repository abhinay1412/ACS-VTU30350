# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

 

 **Example 1:** 

 **Input:**  s = "()"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "()[]{}"

 **Output:**  true

 **Example 3:** 

 **Input:**  s = "(]"

 **Output:**  false

 **Example 4:** 

 **Input:**  s = "([])"

 **Output:**  true

 **Example 5:** 

 **Input:**  s = "([)]"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of parentheses only '()[]{}'.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.5 MB  
**Submitted:** 2026-08-27T04:50:58.681Z  

```java
import java.util.*; // Include Stack and Map

public class Solution {
    public boolean isValid(String s) {
        // 1. Stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        
        // 2. Map to match closing → opening brackets
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        // 3. Process each character
        for (char c : s.toCharArray()) {
            // If NOT a closing bracket → push to stack
            if (!map.containsKey(c)) {
                stack.push(c);
            }
            // If IS a closing bracket → check match
            else if (!stack.isEmpty() && stack.pop() != map.get(c)) {
                return false;
            }
        }
        
        // 4. Final check - all brackets closed?
        return stack.isEmpty();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)