# Binary Tree Right Side View

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `root` of a binary tree, imagine yourself standing on the  **right side**  of it, return  *the values of the nodes you can see ordered from top to bottom*.

 

 **Example 1:** 

 **Input:**  root = [1,2,3,null,5,null,4]

 **Output:**  [1,3,4]

 **Explanation:** 

 **Example 2:** 

 **Input:**  root = [1,2,3,4,null,null,null,5]

 **Output:**  [1,3,4,5]

 **Explanation:** 

 **Example 3:** 

 **Input:**  root = [1,null,3]

 **Output:**  [1,3]

 **Example 4:** 

 **Input:**  root = []

 **Output:**  []

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 70.63%)  
**Memory:** 43.3 MB (beats 93.09%)  
**Submitted:** 2026-08-29T04:22:14.411Z  

```java
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer>list =  new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       if (root!=null) q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode removal = q.remove();

                if(i == size-1)
                list.add(removal.val);

                if(removal.left !=null)
                    q.add(removal.left);
                if(removal.right !=null)
                   q.add(removal.right);
            }
        }
        return list;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-tree-right-side-view/)