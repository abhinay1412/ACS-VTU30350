# Arrays 1D - Unsold Products

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

In a coding project you are developing a feature for a data visualization tool that process large datasets of products stored in array A. One dataset contains sales figures for various products where a sale value of 0 indicates that the product was not sold during a specific period. Your task is to find and return an integer array representing the dataset representing all the unsold products at the end.

 **Input Format** 

- An integer N containing the array size
- An integer array A containing sales number of a particular product.
- List Item

 **Constraints** 

NA

 **Output Format** 

Return an integer array representing the dataset representing all the unsold products at the end.

 **Sample Input 0** 

```
7
5 2 0 8 0 2 1

```

 **Sample Output 0** 

```
5 2 8 2 1 0 0

```

 **Explanation 0** 

Here, A = {5, 2, 0, 8, 0, 2, 1}. The dataset contains zeros at position 2 and 4. After shifting all zeros to the end, the non-zero elements {5, 2, 8, 2, 1} retain the original order. And the last two positions will be occupied with zeros.

 **Sample Input 1** 

```
7
1 0 3 0 5 0 6

```

 **Sample Output 1** 

```
1 3 5 6 0 0 0

```

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T05:47:36.103Z  

```py
# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
a = list(map(int, input().split()))
print(*(x for x in a if x != 0), *([0] * a.count(0)))

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-unsold-products/problem)