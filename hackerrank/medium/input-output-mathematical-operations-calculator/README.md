# Input & Output - Mathematical Operations Calculator

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are tasked with developing a Basic Mathematical Operations Calculator for a finance application. The application allows users to perform some essential operations on two given numbers. These operations include finding the square root, power of a number, and the absolute value of a number.

This type of calculator is often used in financial applications where users need to quickly compute mathematical functions like interest calculations, forecasting, or risk analysis.

Write a program that takes two numbers as input from the user and performs basic mathematical operations on them, such as:

- Finding the square root of the first number,
- Calculating the power of the first number raised to the second number,
- Determining the absolute value of both numbers.

The program should output the results of these mathematical functions.

 **Input Format** 

- A floating-point number representing the first number.
- A floating-point number representing the second number.

 **Constraints** 

NA

 **Output Format** 

- Print the square root of the first number.
- Print the first number raised to the power of the second number.
- Print the absolute value of both numbers.

 **Sample Input 0** 

```
25.0
3.0

```

 **Sample Output 0** 

```
Square Root of first number: 5.0
First number raised to the power of second number: 15625.0
Absolute value of first number: 25.0
Absolute value of second number: 3.0

```

 **Sample Input 1** 

```
9.0
2.0

```

 **Sample Output 1** 

```
Square Root of first number: 3.0
First number raised to the power of second number: 81.0
Absolute value of first number: 9.0
Absolute value of second number: 2.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:38:30.261Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        System.out.println("Square Root of first number: " + Math.sqrt(a));
        System.out.println("First number raised to the power of second number: " + Math.pow(a, b));
        System.out.println("Absolute value of first number: " + Math.abs(a));
        System.out.println("Absolute value of second number: " + Math.abs(b));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/input-output-mathematical-operations-calculator/problem)