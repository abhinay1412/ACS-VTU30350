<div align="center">

# 📅 Week 6: Priority Queues, Binary Search Trees & Lowest Common Ancestor
### *Applied Coding Skills (S1L10) — Module 6*

[![Problems Solved](https://img.shields.io/badge/Solved-6%2F6-6366f1?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_Easy-0-10b981?style=for-the-badge)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_Medium-6-f59e0b?style=for-the-badge)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_Hard-0-ef4444?style=for-the-badge)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/Language-Java-b07219?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)

<p align="center">
  Focuses on Binary Search Tree (BST) order invariants, tree ancestry divergence algorithms (Lowest Common Ancestor), priority queues (Min-Heaps), bounded frequency heaps, and multi-stream K-way frontier searches.
</p>

</div>

---

## 🎯 Learning Objectives

- **BST Traversal Invariant & Kth Smallest Element:** Utilizing the monotonic non-decreasing nature of inorder traversal (`left -> root -> right`) on Binary Search Trees to halt early upon visiting $k$ elements in $O(H + k)$ time.
- **BST Lowest Common Ancestor (LCA):** Leveraging BST directional value properties ($p.val < root.val$ and $q.val < root.val$) to navigate down the tree iteratively in $O(H)$ time and $O(1)$ auxiliary space.
- **General Binary Tree LCA via Postorder DFS:** Traversing subtrees bottom-up to locate lowest divergence points where target nodes reside in distinct subtrees.
- **Priority Queues & Kth Largest Element:** Managing order statistics over unsorted data streams using min-heaps, quickselect, or descending stream transformations.
- **Top K Frequent Elements via Bounded Heap:** Maintaining a min-heap restricted to size $k$ based on frequency counts to yield optimal $O(N \log k)$ runtime.
- **K-Way Merge with Min-Heap (Smallest Sum Pairs):** Modeling search state frontiers across two sorted arrays using a PriorityQueue to greedily extract pairs in $O(k \log(\min(N_1, k)))$ time.

---

## 📋 Problem Directory

| # | Problem Title | Difficulty | Key Pattern / Concept | Time | Space | Performance | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| 0215 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | PriorityQueue / Min-Heap / Stream Sorting | $O(N \log N)$ | $O(N)$ | `144 ms (11.41%)` | [solution.java](0215-kth-largest-element-in-an-array/solution.java) | [README.md](0215-kth-largest-element-in-an-array/README.md) |
| 0230 | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Inorder Traversal (BST Property) / Early-Stop DFS | $O(H + k)$ | $O(H)$ | `0 ms (100.00%)` | [solution.java](0230-kth-smallest-element-in-a-bst/solution.java) | [README.md](0230-kth-smallest-element-in-a-bst/README.md) |
| 0235 | [Lowest Common Ancestor of a BST](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | BST Value Split / Iterative Traversal | $O(H)$ | $O(1)$ | `6 ms (97.07%)` | [solution.java](0235-lowest-common-ancestor-of-a-binary-search-tree/solution.java) | [README.md](0235-lowest-common-ancestor-of-a-binary-search-tree/README.md) |
| 0236 | [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Postorder DFS / Subtree Divergence Detection | $O(N)$ | $O(H)$ | `15 ms (89.74%)` | [solution.java](0236-lowest-common-ancestor-of-a-binary-tree/solution.java) | [README.md](0236-lowest-common-ancestor-of-a-binary-tree/README.md) |
| 0347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | HashMap + Bounded Min-Heap (Size $k$) | $O(N \log k)$ | $O(N)$ | `16 ms (40.56%)` | [solution.java](0347-top-k-frequent-elements/solution.java) | [README.md](0347-top-k-frequent-elements/README.md) |
| 0373 | [Find K Pairs with Smallest Sums](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Min-Heap / K-Way Frontier Expansion | $O(k \log(\min(N_1, k)))$ | $O(\min(N_1, k))$ | `29 ms (97.37%)` | [solution.java](0373-find-k-pairs-with-smallest-sums/solution.java) | [README.md](0373-find-k-pairs-with-smallest-sums/README.md) |

---

<div align="center">

[⬅️ Week 5 — Binary Trees](../Week-5/) • [⬅️ Back to Main Repository](../README.md) • [➡️ Week 7 — Graphs](../Week-7/)

</div>
