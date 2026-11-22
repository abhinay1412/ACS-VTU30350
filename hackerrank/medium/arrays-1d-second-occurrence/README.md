# Arrays 1D - Second Occurrence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Charles is given an array A. He wants to find the count of occurrence of second largest element in the array. Your task is to help him find and return an integer value representing the count of occurrence of the second largest element in an array.

 **Note** 

- If the array contains the same elements, then return 0
- The array has only consecutive elements

 **Input Format** 

- An integer N, representing length of array.
- An integer array A

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing the count of occurrence of the second largest element in an array.

 **Sample Input 0** 

```
8
1 2 3 4 4 5 5 5

```

 **Sample Output 0** 

```
2

```

 **Explanation 0** 

Here the length of array A is 8(N). The second largest element is 4 and the occurrence of 4 is 2 times. Therefore, 2 is returned as the output.

 **Sample Input 1** 

```
1
5

```

 **Sample Output 1** 

```
0

```

 **Explanation 1** 

Here the length of array A is 1(N). Since the array has only one element and there are no other element to compare, therefore, 0 is returned as the output.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T08:13:52.376Z  

```py
n = int(input())
arr = [int(x) for x in input().split()]

unique_vals = sorted(set(arr))

if len(unique_vals) < 2:
    print(0)
else:
    second_largest = unique_vals[-2]
    print(arr.count(second_largest))

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-second-occurrence/problem)