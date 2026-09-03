# Make Lexicographically Smallest Array by Swapping Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a  **0-indexed**  array of  **positive**  integers `nums` and a  **positive**  integer `limit`.

In one operation, you can choose any two indices `i` and `j` and swap `nums[i]` and `nums[j]`  **if**  `|nums[i] - nums[j]| <= limit`.

Return  *the  **lexicographically smallest array**  that can be obtained by performing the operation any number of times*.

An array `a` is lexicographically smaller than an array `b` if in the first position where `a` and `b` differ, array `a` has an element that is less than the corresponding element in `b`. For example, the array `[2,10,3]` is lexicographically smaller than the array `[10,2,3]` because they differ at index `0` and `2 < 10`.

 

 **Example 1:** 

```
Input: nums = [1,5,3,9,8], limit = 2
Output: [1,3,5,8,9]
Explanation: Apply the operation 2 times:
- Swap nums[1] with nums[2]. The array becomes [1,3,5,9,8]
- Swap nums[3] with nums[4]. The array becomes [1,3,5,8,9]
We cannot obtain a lexicographically smaller array by applying any more operations.
Note that it may be possible to get the same result by doing different operations.

```

 **Example 2:** 

```
Input: nums = [1,7,6,18,2,1], limit = 3
Output: [1,6,7,18,1,2]
Explanation: Apply the operation 3 times:
- Swap nums[1] with nums[2]. The array becomes [1,6,7,18,2,1]
- Swap nums[0] with nums[4]. The array becomes [2,6,7,18,1,1]
- Swap nums[0] with nums[5]. The array becomes [1,6,7,18,1,2]
We cannot obtain a lexicographically smaller array by applying any more operations.

```

 **Example 3:** 

```
Input: nums = [1,7,28,19,10], limit = 3
Output: [1,7,28,19,10]
Explanation: [1,7,28,19,10] is the lexicographically smallest array we can obtain because we cannot apply the operation on any two indices.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 109
- 1 <= limit <= 109

## Solution

**Language:** Java  
**Runtime:** 113 ms (beats 42.42%)  
**Memory:** 149.5 MB (beats 72.73%)  
**Submitted:** 2026-08-29T04:00:55.810Z  

```java
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, List<Integer>> group = new HashMap<>();
        Map<Integer, Integer> groupId = new HashMap<>();
        Map<Integer, Integer> pos = new HashMap<>();

        int id = 1;

        // Build groups
        group.computeIfAbsent(id, k -> new ArrayList<>()).add(sorted[0]);

        for(int i = 1; i < n; i++){
            if(sorted[i] - sorted[i - 1] > limit){
                id++;
            }

            group.computeIfAbsent(id, k -> new ArrayList<>()).add(sorted[i]);
        }

        // Store group id of every value
        id = 1;

        for(int i = 0; i < n; i++){
            if(i > 0 && sorted[i] - sorted[i - 1] > limit){
                id++;
            }

            groupId.put(sorted[i], id);
        }

        // Position pointer for each group
        for(int i = 1; i <= id; i++){
            pos.put(i, 0);
        }

        // Rebuild nums using the smallest
        // available value from its group
        for(int i = 0; i < n; i++){
            int grp = groupId.get(nums[i]);

            nums[i] = group.get(grp).get(pos.get(grp));
            pos.put(grp, pos.get(grp) + 1);
        }

        return nums;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/)