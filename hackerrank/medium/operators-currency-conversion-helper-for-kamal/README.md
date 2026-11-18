# Operators - Currency Conversion Helper for Kamal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Kamal is traveling from Korea to the USA and is trying to understand the currency system there. He encounters a situation where he needs to add two amounts expressed in dollars and cents. To help him out, we need to write a program that takes these values as input, calculates the total amount, and then displays the result in dollars and cents.

This exercise will help you understand how to perform arithmetic operations with different units and handle potential overflow in monetary values.

Write a program that:

- Accepts four integer inputs: The first two integers represent the dollar and cent values of the first amount. The next two integers represent the dollar and cent values of the second amount.
- Calculates the total amount in dollars and cents.
- Outputs the result in the format: total dollars and total cents.

 **Input Format** 

Four integers: dollar1, cent1, dollar2, cent2.

 **Constraints** 

NA

 **Output Format** 

Two integers representing the total dollars and total cents.

 **Sample Input 0** 

```
30
10
140
99

```

 **Sample Output 0** 

```
171
9

```

 **Explanation 0** 

- The first amount is dollar 30.10 and the second amount is dollar 140.99.
- Total dollars = 30 + 140 = 170
- Total cents = 10 + 99 = 109 (which is 1 dollar and 9 cents)
- Therefore, the final output is 171 dollars and 9 cents.

 **Sample Input 1** 

```
99
99
99
99

```

 **Sample Output 1** 

```
199
98

```

 **Explanation 1** 

- The first amount is dollar 99.99 and the second amount is also dollar 99.99.
- Total dollars = 99 + 99 = 198
- Total cents = 99 + 99 = 198 (which is 1 dollar and 98 cents)
- Therefore, the final output is 199 dollars and 98 cents.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T18:42:23.916Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int dollar1 = sc.nextInt();
        int cent1 = sc.nextInt();
        int dollar2 = sc.nextInt();
        int cent2 = sc.nextInt();
        int sum1 = dollar1 + dollar2;
        int sum2 = cent1 + cent2;
        int sum3 = sum2%100;
        int sum4 = sum2/100;
        int sum5 = sum1 + sum4;
        System.out.println(sum5);
        System.out.println(sum3);

    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/operators-currency-conversion-helper-for-kamal/problem)