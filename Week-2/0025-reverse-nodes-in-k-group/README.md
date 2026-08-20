# Reverse Nodes in k-Group

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given the `head` of a linked list, reverse the nodes of the list `k` at a time, and return  *the modified list*.

`k` is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of `k` then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]

```

 **Example 2:** 

```
Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]

```

 

 **Constraints:** 

- The number of nodes in the list is n.
- 1 <= k <= n <= 5000
- 0 <= Node.val <= 1000

 

 **Follow-up:**  Can you solve the problem in `O(1)` extra memory space?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 34.55%)  
**Memory:** 45.8 MB (beats 99.05%)  
**Submitted:** 2026-08-20T03:40:47.179Z  

```java
class Solution {
/**
* Reverses nodes in k-group
* Given a linked list, reverse the nodes of a linked list k at a time
* @param head The head of the linked list
* @param k The group size for reversal
* @return The new head of the modified linked list
*/
public ListNode reverseKGroup(ListNode head, int k) {
// Create a dummy node to simplify edge cases
ListNode dummy = new ListNode(0);
dummy.next = head;
// Pointer to track the node before the current group
ListNode previousGroupTail = dummy;
while (previousGroupTail != null) {
// Check if there are at least k nodes remaining
ListNode currentNode = previousGroupTail;
for (int i = 0; i < k; i++) {
currentNode = currentNode.next;
if (currentNode == null) {
// Less than k nodes remaining, return the result
return dummy.next;
}
}
// Save pointers for the reversal process
ListNode groupStart = previousGroupTail.next; // First node of current group
ListNode nextGroupStart = currentNode.next; // First node of next group
// Disconnect the current group from the rest of the list
currentNode.next = null;
// Reverse the current group and connect it back
previousGroupTail.next = reverse(groupStart);
// After reversal, groupStart becomes the tail of the reversed group
groupStart.next = nextGroupStart;
// Move previousGroupTail to the tail of the current reversed group
previousGroupTail = groupStart;
}
return dummy.next;
}
/**
* Helper method to reverse a linked list
* @param head The head of the linked list to reverse
* @return The new head of the reversed linked list
*/
private ListNode reverse(ListNode head) {
// Use dummy node to build the reversed list
ListNode dummy = new ListNode();
ListNode current = head;
// Iterate through the list and prepend each node to dummy
while (current != null) {
ListNode nextNode = current.next; // Save the next node
current.next = dummy.next; // Point current to the reversed list
dummy.next = current; // Make current the new head of reversed list
current = nextNode; // Move to the next node
}
return dummy.next;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-nodes-in-k-group/)