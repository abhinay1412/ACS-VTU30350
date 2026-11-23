# Arrays 1D - Nick's check

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Nick has been given a list of random numbers by his teacher. These numbers are marks of several students of his class. He is required to arranged the marks in increasing order and hence check whether the new arrangement of marks are successive in nature or not. You need to write a function such that it returns 1 if the complete arrangement consists of consecutive marks, otherwise return 0.

 **Note** 

If two students have the same marks, then after arranging them in increasing order, they will not be considered as consecutive.

 **Input Format** 

- Integer N i.e., size of the array
- Integer array for elements of the array

 **Constraints** 

NA

 **Output Format** 

Return 1 if all the numbers are consecutive after arrangement, otherwise return 0.

 **Sample Input 0** 

```
6
3 7 2 5 4 6

```

 **Sample Output 0** 

```
1

```

 **Explanation 0** 

- After arranging the given numbers in increasing order, the array comes out to be as 2, 3, 4, 5, 6, 7.
- As all the numbers in the array are consecutive, therefore 1 is returned.

 **Sample Input 1** 

```
6
1 9 2 4 0 3

```

 **Sample Output 1** 

```
0

```

 **Explanation 1** 

- After arranging the given numbers in increasing order, the array comes out to be as 0,1,2,3,4,9
- The numbers are not consecutive (gap between 4 and 9), so the output is 0.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T05:38:23.849Z  

```py
# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
a = list(map(int, input().split()))
print(1 if len(set(a)) == n and max(a) - min(a) == n - 1 else 0)

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-nicks-check/problem)