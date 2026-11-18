# Input & Output - ASCII Decoder Tool

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are developing an ASCII Decoder Tool for a software application that needs to convert ASCII values back into their corresponding characters. This tool is particularly useful for developers, data analysts, or anyone working with encoded text data, where knowing the character corresponding to an ASCII value can aid in data interpretation and debugging.

In this scenario, the program prompts the user to input an ASCII value (an integer). The program then computes and displays the equivalent character for the given ASCII value. This functionality allows users to convert numeric codes back into readable text, which is especially beneficial when working with data that has been processed or encoded.

 **Input Format** 

The input consists of a single integer representing an ASCII value.

 **Constraints** 

NA

 **Output Format** 

The output should print the corresponding character for the given ASCII value.

 **Sample Input 0** 

```
119

```

 **Sample Output 0** 

```
w

```

 **Sample Input 1** 

```
65

```

 **Sample Output 1** 

```
A

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:14:14.529Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char ascii = (char) a;
        
        System.out.println(ascii);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/input-output-ascii-decoder-tool/problem)