# Binary Tree Level Order Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, return  *the level order traversal of its nodes' values*. (i.e., from left to right, level by level).

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]

```

 **Example 2:** 

```
Input: root = [1]
Output: [[1]]

```

 **Example 3:** 

```
Input: root = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 2000].
- -1000 <= Node.val <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 95.86%)  
**Memory:** 46.7 MB (beats 80.64%)  
**Submitted:** 2026-08-29T04:01:56.267Z  

```java

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size(); 
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++){

                TreeNode curr = queue.poll();
                level.add(curr.val);

                if(curr.left != null){
                    queue.offer(curr.left);
                }

                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }

            ans.add(level);
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-level-order-traversal/)