# Binary Tree Paths

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the `root` of a binary tree.

Return all  **root-to-leaf**  paths in  **any order**.

A  **leaf**  is a node with no children.

 

 **Example 1:** 

```
Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

```

 **Example 2:** 

```
Input: root = [1]
Output: ["1"]

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 82.67%)  
**Memory:** 43.9 MB (beats 84.08%)  
**Submitted:** 2026-09-11T14:46:23.672Z  

```java

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(root, path, ans);
        return ans;
    }

    private void dfs(TreeNode node, List<String> path, List<String> ans) {
        if (node == null) return;

        path.add(Integer.toString(node.val));
        if (node.left == null && node.right == null) {
            ans.add(String.join("->", path));
        } else {
            dfs(node.left, path, ans);
            dfs(node.right, path, ans);
        }
        path.remove(path.size() - 1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-paths/)