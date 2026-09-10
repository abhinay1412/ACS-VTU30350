# Path Sum II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree and an integer `targetSum`, return  *all  **root-to-leaf**  paths where the sum of the node values in the path equals* `targetSum` *. Each path should be returned as a list of the node  **values**, not node references*.

A  **root-to-leaf**  path is a path starting from the root and ending at any leaf node. A  **leaf**  is a node with no children.

 

 **Example 1:** 

```
Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: [[5,4,11,2],[5,8,4,5]]
Explanation: There are two paths whose sum equals targetSum:
5 + 4 + 11 + 2 = 22
5 + 8 + 4 + 5 = 22

```

 **Example 2:** 

```
Input: root = [1,2,3], targetSum = 5
Output: []

```

 **Example 3:** 

```
Input: root = [1,2], targetSum = 0
Output: []

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 5000].
- -1000 <= Node.val <= 1000
- -1000 <= targetSum <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.99%)  
**Memory:** 44.8 MB (beats 99.51%)  
**Submitted:** 2026-09-10T04:22:45.975Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPaths(root, targetSum, currentPath, result);
        return result;
    }

    private void findPaths(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        // Add current node's value to current path
        currentPath.add(node.val);

        // Check if current node is a leaf and path sum equals targetSum
        if (node.left == null && node.right == null && targetSum == node.val) {
            result.add(new ArrayList<>(currentPath)); // Make a copy of the path
        } else {
            // Recurse on left and right subtrees
            findPaths(node.left, targetSum - node.val, currentPath, result);
            findPaths(node.right, targetSum - node.val, currentPath, result);
        }

        // Backtrack: remove the last element before returning
        currentPath.remove(currentPath.size() - 1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/path-sum-ii/)