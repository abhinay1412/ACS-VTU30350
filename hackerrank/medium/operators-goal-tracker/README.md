# Operators - Goal Tracker

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are developing a feature for daily steps. Users input a health and fitness app that helps users the total number of daily steps S, the number of steps they 20 track their have completed D, and the number of days they have been tracking their steps N Your task is to find and return an integer value representing the average number of steps the user needs to take per day to reach their target.

 **Note** 
Round off the output to its nearest value.

 **Input Format** 

- An integer value S representing the total number of daily steps.
- An integer value D representing the number of steps user has completed.
- An integer value N representing the number of days the user has been tracking their steps.

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing the average number of steps the user needs to take per day to reach their target

 **Sample Input 0** 

```
348
327
5

```

 **Sample Output 0** 

```
4

```

 **Explanation 0** 

Here, S=348, D-327 and N=5. The user needs to take 21 more steps (348-327-21). Since they have been tracking their steps for 5 days, the average steps per day needed to reach the target is 21/5, which is approximately 4. Hence, 4 is returned as output

 **Sample Input 1** 

```
6000
2455
7

```

 **Sample Output 1** 

```
506

```

 **Explanation 1** 

Here, S=6000, D=2455 and N=7. The user needs to take 3545 more steps (6000- 2455). Since they have been tracking their steps for 7 days, the average steps per day needed to reach the target is 3545/7, which is approximately 506, Hence 506 is returned as output

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T17:54:33.424Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int S = sc.nextInt();
        int D = sc.nextInt();
        int N = sc.nextInt();
        double diff = S-D;
        double rnd = diff/N;
        System.out.println(Math.round(rnd));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/operators-goal-tracker/problem)