# Recursion - Calculating Factorials for the Space Expedition

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In the futuristic world of 2140, a team of astronauts is preparing for a journey to Mars. As part of their training, they are required to calculate various mathematical functions, one of which is the factorial of a number. The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.

To streamline their calculations, the team decided to implement a program that uses recursion to compute the factorial. Your task is to help them write a program that calculates the factorial of a given number using a recursive approach.

Write a program that takes a non-negative integer as input and returns its factorial using recursion.

 **Input Format** 

The input consists of a single non-negative integer n.

 **Constraints** 

NA

 **Output Format** 

Print the factorial of the number.

 **Sample Input 0** 

```
5

```

 **Sample Output 0** 

```
120

```

 **Explanation 0** 

The factorial of 5 is calculated as:

5!=5×4×3×2×1=120

 **Sample Input 1** 

```
0

```

 **Sample Output 1** 

```
1

```

 **Explanation 1** 

The factorial of 0 is defined as:

0!=1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T08:59:46.477Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/recursion-calculating-factorials-for-the-space-expedition/problem)