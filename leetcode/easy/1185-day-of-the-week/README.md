# Day of the Week

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the `day`, `month` and `year` respectively.

Return the answer as one of the following values `{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}`.

 **Note:**  January 1, 1971 was a Friday.

 

 **Example 1:** 

```
Input: day = 31, month = 8, year = 2019
Output: "Saturday"

```

 **Example 2:** 

```
Input: day = 18, month = 7, year = 1999
Output: "Sunday"

```

 **Example 3:** 

```
Input: day = 15, month = 8, year = 1993
Output: "Sunday"

```

 

 **Constraints:** 

- The given dates are valid dates between the years 1971 and 2100.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.4 MB (beats 70.10%)  
**Submitted:** 2026-09-08T06:56:38.874Z  

```java
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            days[1] = 29;
        }
        int totalDays = 0;

        //years
        for(int i = 1971; i < year; i++){
            if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
                totalDays += 366;
            }
            else{
                totalDays += 365;
            }
        }

        //months
        for(int i = 0; i < month - 1; i++){
            totalDays += days[i];
        }

        //days
        totalDays += day - 1;

        String[] week = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        
        int index = totalDays % 7;
        return week[index];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/day-of-the-week/)