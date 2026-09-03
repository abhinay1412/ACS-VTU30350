# Matrix Block Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a `m x n` matrix `mat` and an integer `k`, return  *a matrix*  `answer`  *where each*  `answer[i][j]`  *is the sum of all elements*  `mat[r][c]`  *for* :

- i - k <= r <= i + k,
- j - k <= c <= j + k, and
- (r, c) is a valid position in the matrix.

 

 **Example 1:** 

```
Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[12,21,16],[27,45,33],[24,39,28]]

```

 **Example 2:** 

```
Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
Output: [[45,45,45],[45,45,45],[45,45,45]]

```

 

 **Constraints:** 

- m == mat.length
- n == mat[i].length
- 1 <= m, n, k <= 100
- 1 <= mat[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 444 ms (beats 13.69%)  
**Memory:** 46.8 MB (beats 42.02%)  
**Submitted:** 2026-08-24T06:28:30.564Z  

```java
class Solution {
    //input: n * m = O(n^2)
    
    //time :O(n^4), n = number of rows and cols in mat to loop through
    //space:O(n^2), n = number of rows and cols in grid 

    public int[][] matrixBlockSum(int[][] mat, int k) {
        // i - k <= row <= i + k
        // j - k <= col <= j + k

        int row = mat.length;
        int col = mat[0].length;

        int[][] grid = new int[row][col];

        // first time loop
        for(int i =0; i < mat.length; i++) {
            for(int j =0; j < mat[i].length; j++) {
                int sum = 0;

                // second time loop
                for(int r = i - k; r <= i + k; r++) {
                    for(int c = j - k; c <= j + k; c++) {
                        
                        //check bounds
                        if(r >= 0 && r < row && c >= 0 && c < col) {
                            sum += mat[r][c];
                        }
                    }
                }

                grid[i][j] = sum;
            }
        }

        return grid;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/matrix-block-sum/)