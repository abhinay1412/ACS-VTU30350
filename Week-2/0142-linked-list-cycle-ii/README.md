# Linked List Cycle II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, return  *the node where the cycle begins. If there is no cycle, return* `null`.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to (**0-indexed**). It is `-1` if there is no cycle.  **Note that**  `pos`  **is not passed as a parameter**.

 **Do not modify**  the linked list.

 

 **Example 1:** 

```
Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node.

```

 **Example 2:** 

```
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.

```

 **Example 3:** 

```
Input: head = [1], pos = -1
Output: no cycle
Explanation: There is no cycle in the linked list.

```

 

 **Constraints:** 

- The number of the nodes in the list is in the range [0, 104].
- -105 <= Node.val <= 105
- pos is -1 or a valid index in the linked-list.

 

 **Follow up:**  Can you solve it using `O(1)` (i.e. constant) memory?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.5 MB (beats 70.77%)  
**Submitted:** 2026-08-20T03:43:41.957Z  

```java
public class Solution {
/**
* Detects if a linked list has a cycle and returns the node where the cycle begins.
* Uses Floyd's Cycle-Finding Algorithm (Tortoise and Hare).
*
* @param head The head of the linked list
* @return The node where the cycle begins, or null if no cycle exists
*/
public ListNode detectCycle(ListNode head) {
// Initialize two pointers: fast (hare) and slow (tortoise)
ListNode fastPointer = head;
ListNode slowPointer = head;
// Phase 1: Detect if a cycle exists using two-pointer technique
// Fast pointer moves 2 steps, slow pointer moves 1 step
while (fastPointer != null && fastPointer.next != null) {
slowPointer = slowPointer.next; // Move slow pointer one step
fastPointer = fastPointer.next.next; // Move fast pointer two steps
// If pointers meet, a cycle exists
if (slowPointer == fastPointer) {
// Phase 2: Find the start of the cycle
// Move one pointer to head and keep the other at meeting point
ListNode startPointer = head;
// Move both pointers one step at a time until they meet
// The meeting point is the start of the cycle
while (startPointer != slowPointer) {
startPointer = startPointer.next;
slowPointer = slowPointer.next;
}
// Return the node where the cycle begins
return startPointer;
}
}
// No cycle found
return null;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/linked-list-cycle-ii/)