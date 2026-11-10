# Arrays 1D - Data Recovery - Reversing the Sensor Log

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you are working as a software engineer for a weather monitoring company. The company collects temperature readings from multiple sensors at regular intervals throughout the day and stores these readings in an array. Due to a system glitch, the readings got recorded in reverse order. Your job is to reverse the order of the readings to restore them to their original sequence so that the data analysis team can proceed with their work.

Write a program that takes an array of temperature readings as input, reverses the array, and outputs the restored sequence.

 **Input Format** 

- The first line contains an integer n, the number of temperature readings.
- The second line contains n space-separated integers representing the temperature readings.

 **Constraints** 

NA

 **Output Format** 

Output the restored temperature readings in a single line, separated by spaces.

 **Sample Input 0** 

```
5  
23 25 21 19 18  

```

 **Sample Output 0** 

```
18 19 21 25 23

```

 **Explanation 0** 

- There are 5 temperature readings: 23, 25, 21, 19, 18.
- The original readings were recorded in reverse order due to the glitch.
- After reversing the array, we get 18, 19, 21, 25, 23, which is the corrected order.

 **Sample Input 1** 

```
3  
30 28 27 

```

 **Sample Output 1** 

```
27 28 30

```

 **Explanation 1** 

- There are 3 temperature readings: 30, 28, 27.
- The original readings were reversed. After fixing, we get 27, 28, 30.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T09:39:20.460Z  

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
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=n-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-data-recovery-reversing-the-sensor-log/problem)