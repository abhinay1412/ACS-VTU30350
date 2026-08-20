# Merge Two Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one  **sorted**  list. The list should be made by splicing together the nodes of the first two lists.

Return  *the head of the merged linked list*.

 

 **Example 1:** 

```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

```

 **Example 2:** 

```
Input: list1 = [], list2 = []
Output: []

```

 **Example 3:** 

```
Input: list1 = [], list2 = [0]
Output: [0]

```

 

 **Constraints:** 

- The number of nodes in both lists is in the range [0, 50].
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in non-decreasing order.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.4 MB (beats 20.48%)  
**Submitted:** 2026-08-20T03:34:16.530Z  

```java
class Solution {
/**
* Merges two sorted linked lists into one sorted linked list.
* The merge is done recursively by comparing the values of the current nodes.
*
* @param list1 The head of the first sorted linked list
* @param list2 The head of the second sorted linked list
* @return The head of the merged sorted linked list
*/
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
// Base case: if list1 is empty, return list2
if (list1 == null) {
return list2;
}
// Base case: if list2 is empty, return list1
if (list2 == null) {
return list1;
}
// Compare the values of the current nodes
if (list1.val <= list2.val) {
// If list1's value is smaller or equal, choose list1's node
// Recursively merge the rest of list1 with list2
list1.next = mergeTwoLists(list1.next, list2);
return list1;
} else {
// If list2's value is smaller, choose list2's node
// Recursively merge list1 with the rest of list2
list2.next = mergeTwoLists(list1, list2.next);
return list2;
}
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)