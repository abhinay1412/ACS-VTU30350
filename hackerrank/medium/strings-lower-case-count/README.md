# Strings - Lower Case Count

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Lewis is given a string S of length N. He likes lowercase letters more than the upper case letters and wants to find their count. Your task is to help him find and return a string representing the lowercase letters and the total count.

 **Input Format** 

- A string
- An integer representing the length of string

 **Constraints** 

NA

 **Output Format** 

Return a string representing the lowercase letters and the total count.

 **Sample Input 0** 

```
HelloWorld
10

```

 **Sample Output 0** 

```
elloorld 8

```

 **Sample Input 1** 

```
JavaProgramming
15

```

 **Sample Output 1** 

```
avarogramming 13

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T09:15:11.669Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        StringBuilder lower = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n && i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                lower.append(ch);
                count++;
            }
        }
        System.out.println(lower.toString() + " " + count);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/strings-lower-case-count/problem)