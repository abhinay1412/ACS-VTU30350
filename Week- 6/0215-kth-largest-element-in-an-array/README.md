# Kth Largest Element in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return  *the*  `kth`  *largest element in the array*.

Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.

Can you solve it without sorting?

 

 **Example 1:** 

```
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

```

 **Example 2:** 

```
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

```

 

 **Constraints:** 

- 1 <= k <= nums.length <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 144 ms (beats 11.41%)  
**Memory:** 84.5 MB (beats 5.06%)  
**Submitted:** 2026-10-08T03:47:34.872Z  

```java
class Solution {
    public int findKthLargest(int[] nums, int k) {

        return Arrays
        .stream(nums)
        .boxed()
        .collect(Collectors.toList())
        .stream()
        .sorted(Comparator.reverseOrder())
        .skip(k-1)
        .findFirst()
        .orElse(-1);
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-largest-element-in-an-array/)