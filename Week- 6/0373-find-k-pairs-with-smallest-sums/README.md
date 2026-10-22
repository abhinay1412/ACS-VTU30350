# Find K Pairs with Smallest Sums

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two integer arrays `nums1` and `nums2` sorted in  **non-decreasing order**  and an integer `k`.

Define a pair `(u, v)` which consists of one element from the first array and one element from the second array.

Return  *the*  `k`  *pairs*  `(u1, v1), (u2, v2),..., (uk, vk)`  *with the smallest sums*.

 

 **Example 1:** 

```
Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
Explanation: The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]

```

 **Example 2:** 

```
Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
Output: [[1,1],[1,1]]
Explanation: The first 2 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 105
- -109 <= nums1[i], nums2[i] <= 109
- nums1 and nums2 both are sorted in non-decreasing order.
- 1 <= k <= 104
- k <= nums1.length * nums2.length

## Solution

**Language:** Java  
**Runtime:** 29 ms (beats 97.37%)  
**Memory:** 138.8 MB (beats 39.77%)  
**Submitted:** 2026-10-08T03:50:22.301Z  

```java
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    private static class Pair {
        int sum;
        int i;
        int j;

        public Pair(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> pairs = new ArrayList<>();
        // storing the length of nums1 to use it in a loop later
        int listLength = nums1.length;
        // declaring a min-heap to keep track of the smallest sums
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> a.sum - b.sum);

        // iterate over the length of nums1
        for (int i = 0; i < Math.min(k, listLength); i++) {
            // computing sum of pairs of all elements of nums1 with first index
            // of nums2 and placing it in the min-heap
            minHeap.add(new Pair(nums1[i] + nums2[0], i, 0));
        }

        int counter = 0;
        // iterate over elements of min-heap and only go up to k
        while (!minHeap.isEmpty() && counter < k) {
            // placing sum of the top element of min-heap
            // and its corresponding pairs in i and j
            Pair pair = minHeap.poll();
            int i = pair.i;
            int j = pair.j;
            // add pairs with the smallest sum in the new list
            pairs.add(Arrays.asList(nums1[i], nums2[j]));
            // increment the index for the 2nd list, as we've
            // compared all possible pairs with the 1st index of nums2
            int nextElement = j + 1;
            // if next element is available for nums2 then add it to the heap
            if (nums2.length > nextElement) {
                minHeap.add(new Pair(nums1[i] + nums2[nextElement], i, nextElement));
            }
            counter++;
        }
        // return the pairs with the smallest sums
        return pairs;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/)