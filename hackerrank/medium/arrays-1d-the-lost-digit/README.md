# Arrays 1D - The lost Digit

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are working on a number sequence puzzle. You have an array A, that is supposed to contain all the numbers from 1 to N, but you realize one number is missing. The array might have been shuffled, so the numbers are not in order. Your task is to find and return an integer value representing the missing number from the sequence.

 **Input Format** 

- An integer value N representing the length of the sequence
- An integer array A

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing the missing number from the sequence.

 **Sample Input 0** 

```
5  
3 1 2 5  

```

 **Sample Output 0** 

```
4

```

 **Explanation 0** 

Here, A = {3, 1, 2, 5} and N = 5. The sequence should contain the numbers from 1 to 5 but the number 4 is missing from the array A. Hence, 4 is returned as the output.

 **Sample Input 1** 

```
4  
2 3 4  

```

 **Sample Output 1** 

```
1

```

 **Explanation 1** 

Here, A = {2, 3, 4} and N = 4. The sequence should contain the numbers from 1 to 4 but the number 1 is missing from array A. Hence, 1 is returned as the output.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T13:06:13.244Z  

```py
n = int(input())
arr = list(map(int, input().split()))
present = [False] * (n + 1)
for x in arr:
    present[x] = True
for i in range(1, n + 1):
    if not present[i]:
        print(i)

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/arrays-1d-the-lost-digit/problem)