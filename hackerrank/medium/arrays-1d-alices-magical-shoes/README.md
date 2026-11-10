# Arrays 1D - Alice's Magical shoes!

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Alice has a pair of magical shoes that allows her to climb 3 stairs at once. In the city, there are N houses whose roofs Alice wants to reach. The number of stairs to the roof of each house is given in an array A. Alice can reach the roofs of only those houses where the number of stairs is a multiple of 3. Your task is to find and return an integer value representing the count of the number of houses whose roof Alice can climb up to.

 **Input Format** 

- An integer value N representing the number of houses.
- An integer array A representing the number of stairs in each hous

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing the count of the number of houses whose roofs Alice can climb up to.

 **Sample Input 0** 

```
4  
12 21 3 4  

```

 **Sample Output 0** 

```
3

```

 **Explanation 0** 

Here, the given array is (12,21,3,4). There is only one house, (the 4th), whose roof Alice cannot go up to as it is not a multiple of 3. Therefore, 3 is returned as the output.

 **Sample Input 1** 

```
5  
1 1 1 1 1  

```

 **Sample Output 1** 

```
0

```

 **Explanation 1** 

Here, the given array is (1,1,1,1,1). Alice cannot go up to the roof of any of the houses as none of the elements of the array is a multiple of 3. Therefore, O is returned as the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T08:59:30.907Z  

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
        int cnt = 0;
        int a[]= new int[n];
        for(int i = 0; i<n; i++){
            if(sc.nextInt()%3==0){
                cnt++;
                
            }
        }
        System.out.println(cnt);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-alices-magical-shoes/problem)