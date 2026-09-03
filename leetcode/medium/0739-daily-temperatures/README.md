# Daily Temperatures

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `temperatures` represents the daily temperatures, return  *an array*  `answer`  *such that*  `answer[i]`  *is the number of days you have to wait after the*  `ith`  *day to get a warmer temperature*. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

 

 **Example 1:** 

```
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

```

 **Example 2:** 

```
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

```

 **Example 3:** 

```
Input: temperatures = [30,60,90]
Output: [1,1,0]

```

 

 **Constraints:** 

- 1 <= temperatures.length <= 105
- 30 <= temperatures[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 99.01%)  
**Memory:** 112.5 MB (beats 7.52%)  
**Submitted:** 2026-08-27T03:58:28.778Z  

```java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];

        // Use an array to simulate a stack.
        // The stack stores indices instead of temperatures.
        int[] stack = new int[n];
        int top = -1;

        // Traverse every day's temperature.
        for (int i = 0; i < n; i++) {

            // If today's temperature is warmer than the day on top of the stack,
            // we have found the answer for that previous day.
            while (top >= 0 &&
                   temperatures[i] > temperatures[stack[top]]) {

                // Get the previous day's index.
                int previousDay = stack[top--];

                // The waiting time is the distance between the two indices.
                answer[previousDay] = i - previousDay;
            }

            // Today's temperature has not found a warmer future day yet,
            // so put its index into the stack.
            stack[++top] = i;
        }

        return answer;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/daily-temperatures/)