# Sort Colors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array `nums` with `n` objects colored red, white, or blue, sort them  **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers `0`, `1`, and `2` to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

 **Example 1:** 

```
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

```

 **Example 2:** 

```
Input: nums = [2,0,1]
Output: [0,1,2]

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2.

 

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.4 MB (beats 60.68%)  
**Submitted:** 2026-08-13T03:59:08.030Z  

```java
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // If we find a 0, swap it to the 'low' boundary
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If it's a 1, it's already in the correct middle section
                mid++;
            } else {
                // If we find a 2, swap it to the 'high' boundary
                swap(nums, mid, high);
                high--;
                // Note: We don't increment 'mid' here because the swapped 
                // element from 'high' needs to be evaluated next.
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)