# Arrays 1D - Dinner Dishes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are planning a dinner menu for an event, and you have a list of N dishes stored in array A, each with a certain cost associated with it. You must select two such dishes, such that the sum of their costs is maximum among all available pairs. Your task is to find and return an integer value representing the sum of such available pair. Return 0 in case of no such pair available.

 **Input Format** 

- An integer value N representing the number of dishes available.
- An integer array A representing the cost of dishes

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing sum of such pair available. In case, there are no such pair present, return 0.

 **Sample Input 0** 

```
4
1 10 5 15

```

 **Sample Output 0** 

```
25

```

 **Explanation 0** 

Here, A = (1,10,5,15). The pair with maximum sum would be 10 and 15, since they are the largest in the array of prices and their sum would be 25. Therefore, 25 is returned as the answer

 **Sample Input 1** 

```
3
50 50 50

```

 **Sample Output 1** 

```
100

```

 **Explanation 1** 

Here, A = (50,50,50). The pair with maximum sum would be 50 and 50, since they are the largest in the array of prices and their sum would be 100. Therefore, 100 is returned as the answer.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T08:35:04.748Z  

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
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        long l = arr[n-1] + arr[n-2];
        
        System.out.println(l);
        if(n<2){
            System.out.println("0");
        }
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-dinner-dishes/problem)