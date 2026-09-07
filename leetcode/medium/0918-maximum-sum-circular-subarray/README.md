# Maximum Sum Circular Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a  **circular integer array**  `nums` of length `n`, return  *the maximum possible sum of a non-empty  **subarray**  of* `nums`.

A  **circular array**  means the end of the array connects to the beginning of the array. Formally, the next element of `nums[i]` is `nums[(i + 1) % n]` and the previous element of `nums[i]` is `nums[(i - 1 + n) % n]`.

A  **subarray**  may only include each element of the fixed buffer `nums` at most once. Formally, for a subarray `nums[i], nums[i + 1],..., nums[j]`, there does not exist `i <= k1`, `k2 <= j` with `k1 % n == k2 % n`.

 

 **Example 1:** 

```
Input: nums = [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3.

```

 **Example 2:** 

```
Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.

```

 **Example 3:** 

```
Input: nums = [-3,-2,-3]
Output: -2
Explanation: Subarray [-2] has maximum sum -2.

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 43 MB  
**Submitted:** 2026-09-07T05:47:53.347Z  

```java
class Solution {

    private int minSubarraySum(int[] nums){
        int currSum = nums[0];
        int minSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(currSum > 0){
                currSum = 0;
            }

            currSum += nums[i];
            minSum = Math.min(currSum, minSum);
        }

        return minSum;
    }

    private int maxSubarraySum(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(currSum < 0){
                currSum = 0;
            }

            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public int maxSubarraySumCircular(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        // Check if all elements are negative
        boolean x = true;
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                x = false;
                break;
            }

            ans = Math.max(ans, nums[i]);
        }

        if(x){
            return ans;
        }

        // Case 1: Maximum subarray does not wrap
        int ans1 = maxSubarraySum(nums);

        // Case 2: Maximum subarray wraps around
        int arraySum = 0;

        for(int i = 0; i < nums.length; i++){
            arraySum += nums[i];
        }

        int ans2 = arraySum - minSubarraySum(nums);

        return Math.max(ans1, ans2);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-sum-circular-subarray/)