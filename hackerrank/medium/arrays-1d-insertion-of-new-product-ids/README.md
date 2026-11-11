# Arrays 1D - Insertion of New Product IDs

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In an e-commerce platform, the system manages a list of product IDs that are used to track each product. The platform needs to efficiently insert new product IDs into a sorted list to maintain the order. Rahul, a software engineer, has been tasked with creating a function to insert a new product ID into the correct position in the sorted list of product IDs.

Rahul needs to ensure that the list is always sorted, and the product ID is inserted in the right position without disturbing the existing order.

Given an array of product IDs (sorted in non-decreasing order) and a new product ID, your task is to insert the new product ID into the array, keeping the list sorted.

 **Input Format** 

- The first line contains an integer n representing the number of existing product IDs.
- The second line contains n integers representing the product IDs in sorted order.
- The third line contains an integer newProductId, which represents the new product ID to be inserted.

 **Constraints** 

- 1 ≤ n ≤ 1000
- The product IDs are integers and are sorted in non-decreasing order.
- The new product ID to be inserted is an integer.

 **Output Format** 

Output the new array with the product ID inserted at the correct position, maintaining the sorted order.

 **Sample Input 0** 

```
5
101 105 110 120 130
107

```

 **Sample Output 0** 

```
101 105 107 110 120 130

```

 **Explanation 0** 

The array is initially sorted as [101, 105, 110, 120, 130]. The new product ID 107 is inserted in the correct position, between 105 and 110, resulting in the array [101, 105, 107, 110, 120, 130].

 **Sample Input 1** 

```
4
100 200 300 400
150

```

 **Sample Output 1** 

```
100 150 200 300 400

```

 **Explanation 1** 

The array is initially sorted as [100, 200, 300, 400]. The new product ID 150 is inserted in the correct position, between 100 and 200, resulting in the array [100, 150, 200, 300, 400].

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T03:41:39.404Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        arr[n] = sc.nextInt();
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-insertion-of-new-product-ids/problem)