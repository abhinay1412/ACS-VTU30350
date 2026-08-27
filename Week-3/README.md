<div align="center">

# 📅 Week 3: Stacks, Monotonic Stacks & Simulation
### *Applied Coding Skills (S1L10) — Module 3*

[![Problems Solved](https://img.shields.io/badge/Solved-9%2F9-6366f1?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_Easy-3-10b981?style=for-the-badge)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_Medium-6-f59e0b?style=for-the-badge)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/Language-Java-b07219?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)

<p align="center">
  Focuses on LIFO data structures, monotonic stack optimizations for linear-time next greater/smaller queries, bracket balancing, and sequence simulation.
</p>

</div>

---

## 🎯 Learning Objectives

- **LIFO Bracket & String Balancing:** Validating structured syntax and balancing delimiters using stacks.
- **Monotonic Decreasing Stacks:** Resolving next-greater/warmer element queries in $O(N)$ amortized time.
- **Span Compression:** Tracking cumulative range intervals on the fly via monotonic stack pairs.
- **State Simulation:** Simulating physical processes (e.g., asteroid collisions, push/pop sequences) with stack invariants.

---

## 📋 Problem Directory

| # | Problem Title | Difficulty | Key Pattern / Concept | Time | Space | Performance | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| 0020 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | LIFO Bracket Matching | $O(N)$ | $O(N)$ | `3 ms (86.07%)` | [solution.java](0020-valid-parentheses/solution.java) | [README.md](0020-valid-parentheses/README.md) |
| 0155 | [Min Stack](https://leetcode.com/problems/min-stack/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Dual Stack / Paired Min State | $O(1)$ | $O(N)$ | `34 ms (61.77%)` | [solution.java](0155-min-stack/solution.java) | [README.md](0155-min-stack/README.md) |
| 0496 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Monotonic Decreasing Stack + Map | $O(N + M)$ | $O(N)$ | `2 ms (99.48%)` | [solution.java](0496-next-greater-element-i/solution.java) | [README.md](0496-next-greater-element-i/README.md) |
| 0735 | [Asteroid Collision](https://leetcode.com/problems/asteroid-collision/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Stack Collision Simulation | $O(N)$ | $O(N)$ | `5 ms (67.32%)` | [solution.java](0735-asteroid-collision/solution.java) | [README.md](0735-asteroid-collision/README.md) |
| 0739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Monotonic Decreasing Stack (Indices) | $O(N)$ | $O(N)$ | `71 ms (38.95%)` | [solution.java](0739-daily-temperatures/solution.java) | [README.md](0739-daily-temperatures/README.md) |
| 0901 | [Online Stock Span](https://leetcode.com/problems/online-stock-span/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Monotonic Stack with Span Compression | $O(1)$ *amortized* | $O(N)$ | `31 ms (60.14%)` | [solution.java](0901-online-stock-span/solution.java) | [README.md](0901-online-stock-span/README.md) |
| 0946 | [Validate Stack Sequences](https://leetcode.com/problems/validate-stack-sequences/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Greedy Push-Pop Simulation | $O(N)$ | $O(N)$ | `2 ms (88.46%)` | [solution.java](0946-validate-stack-sequences/solution.java) | [README.md](0946-validate-stack-sequences/README.md) |
| 1249 | [Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/) | ![Medium](https://img.shields.io/badge/Medium-yellow?style=flat-square) | Index Stack / Two-Pass Filter | $O(N)$ | $O(N)$ | `6 ms (97.91%)` | [solution.java](1249-minimum-remove-to-make-valid-parentheses/solution.java) | [README.md](1249-minimum-remove-to-make-valid-parentheses/README.md) |
| 1475 | [Final Prices With a Special Discount in a Shop](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/) | ![Easy](https://img.shields.io/badge/Easy-brightgreen?style=flat-square) | Monotonic Stack (Next Smaller Element) | $O(N)$ | $O(N)$ | `1 ms (99.79%)` | [solution.java](1475-final-prices-with-a-special-discount-in-a-shop/solution.java) | [README.md](1475-final-prices-with-a-special-discount-in-a-shop/README.md) |

---

[⬅️ Back to Main Repository](../README.md)
