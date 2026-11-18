# Input & Output - Financial Application for Rounding Values

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are developing a Financial Calculation Application for a small business that needs to handle monetary values. In financial applications, it's essential to display prices and amounts accurately, especially when dealing with user input. This application should allow users to input a float value (such as an amount of money), and then it will display the rounded-down and rounded-up values.

This functionality is particularly useful in scenarios where pricing strategies might involve rounding amounts to the nearest integer for display purposes, ensuring clarity in transactions.

In this scenario, the program prompts the user to input a float value representing a monetary amount. The program then calculates and displays three values:

- The original float value (truncated to an integer).
- The rounded-up value (using the ceil() function).
- The rounded-down value (using the floor() function).

This output helps users see both the potential maximum and minimum rounded values associated with a given amount.

 **Input Format** 

The input consists of a single float value.

 **Constraints** 

NA

 **Output Format** 

The output consists of:

- The integer part of the float (truncated).
- The rounded-up value.
- The rounded-down value.

 **Sample Input 0** 

```
54.5

```

 **Sample Output 0** 

```
54
55
54

```

 **Explanation 0** 

The user inputs the float value 54.5.

The program calculates:

The integer part (truncated): 54

The rounded-up value using ceil(): 55

The rounded-down value using floor(): 54

The program prints the results in the specified order:

- 54
- 55
- 54

 **Sample Input 1** 

```
99.99

```

 **Sample Output 1** 

```
99
100
99

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:26:09.017Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        
        int truncated = (int) f;
        int roundedUp = (int) Math.ceil(f);
        int roundedDown = (int) Math.floor(f);
        
        System.out.println(truncated);
        System.out.println(roundedUp);
        System.out.println(roundedDown);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/input-output-financial-application-for-rounding-values/problem)