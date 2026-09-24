<div align="center">

# 📅 Week 5: Binary Trees, Depth-First Search (DFS) & Tree Traversals
### *Applied Coding Skills (S1L10) — Module 5*

[![Problems Solved](https://img.shields.io/badge/Solved-9%2F9-6366f1?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_Easy-7-10b981?style=for-the-badge)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_Medium-2-f59e0b?style=for-the-badge)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_Hard-0-ef4444?style=for-the-badge)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/Language-Java-b07219?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)

<p align="center">
  Focuses on hierarchical binary tree structures, recursive and iterative Depth-First Search (DFS) traversals (Inorder, Preorder, Postorder), structural tree equivalence, mirror symmetry validation, root-to-leaf backtracking paths, target sum path accumulation, and two-pointer interval intersection sweeping.
</p>

</div>

---

## 🎯 Learning Objectives

- **Inorder Traversal (L-Root-R):** Traversing the left subtree, visiting the root, and exploring the right subtree; yields monotonic sequences in BSTs.
- **Preorder Traversal (Root-L-R):** Visiting the root node before traversing child subtrees; emulating recursion using an explicit LIFO `Stack<TreeNode>`.
- **Postorder Traversal (L-R-Root):** Bottom-up child subtree processing before evaluating the parent node; essential for tree deletion and post-order dependency evaluations.
- **Structural Tree Equivalence:** Validating simultaneous topological shapes and node values across dual binary trees via recursive base cases.
- **Mirror Symmetry & Reflection:** Formulating cross-branch mirror comparisons (`left.left == right.right` and `left.right == right.left`) to determine bilateral tree symmetry.
- **Root-to-Leaf Path Backtracking:** Constructing valid leaf paths with backtracked state restoration (`path.remove(path.size() - 1)`) for both path strings and node collections.
- **Target Sum Path Reduction:** Propagating decremented sum targets (`targetSum - root.val`) down tree branches to identify valid root-to-leaf paths.
- **Two-Pointer Interval Sweeping:** Computing closed interval overlaps `[max(s1, s2), min(e1, e2)]` and selectively advancing pointers based on interval endpoints.

---

## 📋 Problem Directory

| # | Problem Title | Difficulty | Key Pattern / Concept | Time | Space | Performance | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| 0094 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Recursive Inorder Traversal (L-Root-R) | $O(N)$ | $O(H)$ | `0 ms (100.00%)` | [solution.java](0094-binary-tree-inorder-traversal/solution.java) | [README.md](0094-binary-tree-inorder-traversal/README.md) |
| 0100 | [Same Tree](https://leetcode.com/problems/same-tree/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Structural Recursion / Dual Tree DFS | $O(N)$ | $O(H)$ | `0 ms (100.00%)` | [solution.java](0100-same-tree/solution.java) | [README.md](0100-same-tree/README.md) |
| 0101 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Mirror Reflection Recursion / Dual DFS | $O(N)$ | $O(H)$ | `0 ms (100.00%)` | [solution.java](0101-symmetric-tree/solution.java) | [README.md](0101-symmetric-tree/README.md) |
| 0112 | [Path Sum](https://leetcode.com/problems/path-sum/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Root-to-Leaf Target Sum Reduction DFS | $O(N)$ | $O(H)$ | `0 ms (100.00%)` | [solution.java](0112-path-sum/solution.java) | [README.md](0112-path-sum/README.md) |
| 0113 | [Path Sum II](https://leetcode.com/problems/path-sum-ii/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Backtracking DFS / Path Accumulation | $O(N)$ | $O(H)$ | `1 ms (99.99%)` | [solution.java](0113-path-sum-ii/solution.java) | [README.md](0113-path-sum-ii/README.md) |
| 0144 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Iterative DFS / Explicit Stack (Root-L-R) | $O(N)$ | $O(H)$ | `1 ms (6.65%)` | [solution.java](0144-binary-tree-preorder-traversal/solution.java) | [README.md](0144-binary-tree-preorder-traversal/README.md) |
| 0145 | [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Recursive Postorder Traversal (L-R-Root) | $O(N)$ | $O(H)$ | `0 ms (100.00%)` | [solution.java](0145-binary-tree-postorder-traversal/solution.java) | [README.md](0145-binary-tree-postorder-traversal/README.md) |
| 0257 | [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Root-to-Leaf Path Traversal / Backtracking | $O(N)$ | $O(H)$ | `2 ms (82.67%)` | [solution.java](0257-binary-tree-paths/solution.java) | [README.md](0257-binary-tree-paths/README.md) |
| 0986 | [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Two Pointers / Interval Range Overlap | $O(N + M)$ | $O(1)$ | `4 ms (51.35%)` | [solution.java](0986-interval-list-intersections/solution.java) | [README.md](0986-interval-list-intersections/README.md) |

---

[⬅️ Back to Main Repository](../README.md)
