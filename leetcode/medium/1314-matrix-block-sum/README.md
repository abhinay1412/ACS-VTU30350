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
**Runtime:** 3 ms (beats 99.90%)  
**Memory:** 46.8 MB (beats 42.02%)  
**Submitted:** 2026-08-24T06:29:43.326Z  

```java
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] result=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }

        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                mat[i][j]+=mat[i-1][j];
            }
        }


for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        result[i][j]=getSum(mat,i,j,k);
    }
}
        return result;
    }



private int getSum(int[][] mat,int i,int j,int k){
    int m=mat.length;
    int n=mat[0].length;
    int endRow=Math.min(m-1,i+k);
    int endCol=Math.min(n-1,j+k);

    int sum=mat[endRow][endCol];
    int n1=(j-k-1>=0)?mat[endRow][j-k-1]:0;
    int n2=(i-k-1>=0)?mat[i-k-1][endCol]:0;
    int n3=(j-k-1>=0 && i-k-1>=0)?mat[i-k-1][j-k-1]:0;
        return sum-n1-n2+n3;
}}
```

---

[View on LeetCode](https://leetcode.com/problems/matrix-block-sum/)