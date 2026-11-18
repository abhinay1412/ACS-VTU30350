# Operators - Store water

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You live in a city that is facing a water crisis. The timings when water is supply day are fixed. You have several water tankers that are cylindrical in shape, an know the radius R and height of the tanker. Your task is to find and return integer value representing the amount (in litres) of water you will be able to a particular day.

 **Note** 

- Use π = 3.14
- Round of the values to the nearest integer

 **Input Format** 

- An integer value R representing the radius of the container
- An integer value H representing the height of the container.

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing the amount in litres of water you will be able to store on a particular day.

 **Sample Input 0** 

```
5
10

```

 **Sample Output 0** 

```
785

```

 **Explanation 0** 

Here, the given values are R = 5 and H = 10. The amount of water that can be stored on this day is 3.14 *5* 5*10=785. Therefore, 785 is returned as the output.

 **Sample Input 1** 

```
7
9

```

 **Sample Output 1** 

```
1385

```

 **Explanation 1** 

Here, the given values are R = 7 and H = 9. The amount of water that can be stored on this day is 3.14 *7* 7*9=1384.7, which can be rounded up to the value 1385. Therefore, 1385 is returned as the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:56:59.640Z  

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
        int R = sc.nextInt();
        int H = sc.nextInt();
        System.out.println(Math.round(3.14*R*R*H));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/operators-store-water/problem)