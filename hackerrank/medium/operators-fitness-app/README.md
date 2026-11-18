# Operators - Fitness App

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are developing a small application for a fitness app. In the app, users usually enter their workout duration in N minutes. Your task is to convert the minutes and return an integer representing the equivalent value in seconds.

 **Input Format** 

An integer value N representing the workout in minutes.

 **Constraints** 

NA

 **Output Format** 

Return an integer representing the equivalent value of N in seconds.

 **Sample Input 0** 

```
5

```

 **Sample Output 0** 

```
300

```

 **Explanation 0** 

Here, N = 5. The conversion of 5 minutes will be 5 x 60 = 300 seconds. Hence, 300 is returned as output

 **Sample Input 1** 

```
3

```

 **Sample Output 1** 

```
180

```

 **Explanation 1** 

Here, N = 3. The conversion of 3minutes will be 3 x 60 = 300 seconds. Hence, 180 is returned as output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T17:02:27.244Z  

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
        int N = sc.nextInt();
        System.out.print(N*60);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/operators-fitness-app/problem)