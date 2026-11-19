# Decision Making - Choosing the Tallest Skyscraper

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A city planning committee is considering three skyscraper designs for a new urban development project. To make the most impactful statement in the city's skyline, they need to select the tallest skyscraper from the proposed designs. Each skyscraper's height in meters is provided as input. Your task is to write a program that helps the committee determine which skyscraper is the tallest.

 **Input Format** 

Three integers, height1, height2, and height3, representing the heights of the three skyscrapers.

 **Constraints** 

NA

 **Output Format** 

Print the height of the tallest skyscraper as an integer.

 **Sample Input 0** 

```
250 300 275

```

 **Sample Output 0** 

```
300

```

 **Explanation 0** 

The heights of the skyscrapers are 250m, 300m, and 275m. The tallest one is 300m.

 **Sample Input 1** 

```
450 450 400

```

 **Sample Output 1** 

```
450

```

 **Explanation 1** 

The heights of the skyscrapers are 450m, 450m, and 400m. The tallest one is 450m.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T04:03:34.561Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();
        if(h1>h2&&h1>h3){
            System.out.println(h1);
        }else if(h2>h1&&h2>h3){
            System.out.println(h2);
            
        }else if(h1==h2||h2==h3){
            System.out.println(h2);
        }else{
            System.out.println(h3);
        }
        sc.close();
            
        }
        
        
    }

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/decision-making-choosing-the-tallest-skyscraper/problem)