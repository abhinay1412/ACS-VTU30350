# Input & Output - Character Analysis Tool

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are developing a Character Analysis Tool for a text processing application that helps users analyze characters they input. One of the features of this tool is to display the ASCII value of a given character. This feature can be particularly useful for programmers, data analysts, or anyone working with text data, as ASCII values play a crucial role in various programming tasks and data encoding.

In this scenario, the program prompts the user to input a single character (either uppercase or lowercase). The program then computes and displays the ASCII value of that character. The functionality helps users understand the relationship between characters and their corresponding ASCII values, which can aid in debugging and development processes.

 **Input Format** 

The input consists of a single character, which must be an alphabet (either lowercase or uppercase).

 **Constraints** 

NA

 **Output Format** 

The output should print the ASCII value of the character.

 **Sample Input 0** 

```
a

```

 **Sample Output 0** 

```
97

```

 **Sample Input 1** 

```
A

```

 **Sample Output 1** 

```
65

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:10:30.195Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println(ascii);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/input-output-character-analysis-tool/problem)