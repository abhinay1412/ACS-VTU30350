# Merge k Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

 *Merge all the linked-lists into one sorted linked-list and return it.* 

 

 **Example 1:** 

```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6

```

 **Example 2:** 

```
Input: lists = []
Output: []

```

 **Example 3:** 

```
Input: lists = [[]]
Output: []

```

 

 **Constraints:** 

- k == lists.length
- 0 <= k <= 104
- 0 <= lists[i].length <= 500
- -104 <= lists[i][j] <= 104
- lists[i] is sorted in ascending order.
- The sum of lists[i].length will not exceed 104.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 40.75%)  
**Memory:** 46.8 MB (beats 64.68%)  
**Submitted:** 2026-08-20T03:35:14.998Z  

```java
class Solution {
public ListNode mergeKLists(ListNode[] lists) {
// Initialize a min-heap to store nodes based on their values
// The heap will always give us the node with the smallest value
PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
// Add the head of each non-empty linked list to the heap
for (ListNode head : lists) {
if (head != null) {
minHeap.offer(head);
}
}
// Create a dummy node to simplify list construction
ListNode dummyHead = new ListNode();
ListNode current = dummyHead;
// Process nodes until the heap is empty
while (!minHeap.isEmpty()) {
// Extract the node with the smallest value
ListNode smallestNode = minHeap.poll();
// If this node has a next node, add it to the heap
// This ensures we continue processing the list this node came from
if (smallestNode.next != null) {
minHeap.offer(smallestNode.next);
}
// Append the smallest node to our result list
current.next = smallestNode;
current = current.next;
}
// Return the merged list, skipping the dummy head
return dummyHead.next;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/)