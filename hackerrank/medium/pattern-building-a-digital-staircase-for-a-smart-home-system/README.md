# Pattern - Building a Digital Staircase for a Smart Home System

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you are working on a smart home project where a staircase's LED lighting system needs to be programmed to illuminate in a "right half pyramid" pattern. Each step lights up sequentially, forming a staircase-like appearance when viewed from the side. Your task is to write a program that simulates this lighting effect by printing a right half pyramid pattern.

You are given the number of steps (or rows) of the staircase. Write a program to display the "right half pyramid" pattern, where each row contains a number of stars corresponding to the row number.

 **Input Format** 

The input consists of a single integer n that denotes the number of rows in the pyramid.

 **Constraints** 

NA

 **Output Format** 

The output should display the right half pyramid pattern using stars (*), where each row has a number of stars equal to the row number.

 **Sample Input 0** 

```
5

```

 **Sample Output 0** 

```
*
 ** 
 **  *
 **   ** 
 **   **  *

```

 **Explanation 0** 

- For n = 5, the pyramid has 5 rows.
- The first row has 1 star, the second row has 2 stars, and so on, until the fifth row, which has 5 stars.

 **Sample Input 1** 

```
3

```

 **Sample Output 1** 

```
*
 ** 
 **  *

```

 **Explanation 1** 

- For n = 3, the pyramid has 3 rows.
- The first row has 1 star, the second row has 2 stars, and the third row has 3 stars.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T04:37:32.411Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/pattern-building-a-digital-staircase-for-a-smart-home-system/problem)