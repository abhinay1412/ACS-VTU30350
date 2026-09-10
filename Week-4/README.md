<div align="center">

```
  ███╗   ███╗ ██████╗ ██████╗ ██╗   ██╗██╗     ███████╗     ██████╗ ██╗  ██╗
  ████╗ ████║██╔═══██╗██╔══██╗██║   ██║██║     ██╔════╝    ██╔═████╗██║  ██║
  ██╔████╔██║██║   ██║██║  ██║██║   ██║██║     █████╗      ██║██╔██║███████║
  ██║╚██╔╝██║██║   ██║██║  ██║██║   ██║██║     ██╔══╝      ████╔╝██║╚════██║
  ██║ ╚═╝ ██║╚██████╔╝██████╔╝╚██████╔╝███████╗███████╗    ╚██████╔╝     ██║
  ╚═╝     ╚═╝ ╚═════╝ ╚═════╝  ╚═════╝ ╚══════╝╚══════╝     ╚═════╝      ╚═╝
```

### 🟡 MODULE 04 • QUEUES, RING BUFFERS, MONOTONIC DEQUES & TREE BFS
#### *Applied Coding Skills (S1L10) — FIFO, Monotonic Window & Hierarchical Traversal Tier*

<br/>

[![Solved Status](https://img.shields.io/badge/MODULE_STATUS-9%2F9_SOLVED-00f5d4?style=for-the-badge&logo=target&logoColor=000&labelColor=0d1117)](https://leetcode.com/)
[![Easy](https://img.shields.io/badge/🟢_EASY-2-10b981?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Medium](https://img.shields.io/badge/🟡_MEDIUM-6-f59e0b?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Hard](https://img.shields.io/badge/🔴_HARD-1-ef4444?style=for-the-badge&labelColor=0d1117)](https://leetcode.com/)
[![Language](https://img.shields.io/badge/RUNTIME-JAVA_21+-f78166?style=for-the-badge&logo=openjdk&logoColor=fff&labelColor=0d1117)](https://www.java.com/)

<br/>

<p align="center">
  Focuses on FIFO queue dynamics, circular ring buffers, sliding window boundary optimizations using monotonic double-ended queues (Deques), greedy CPU scheduling, and breadth-first level-order tree traversals.
</p>

[⬅️ RETURN TO MAIN REPO](../README.md) • [📊 PROBLEM DIRECTORY](#-problem-directory--performance) • [🎯 CORE OBJECTIVES](#-core-learning-objectives) • [💡 PATTERN DEEP DIVE](#-pattern-deep-dive--cheat-sheet) • [🔍 PER-PROBLEM ANALYSIS](#-per-problem-analytical-breakdown)

---

</div>

<br/>

## 🎯 Core Learning Objectives

- **Circular Buffer Mechanics:** Implementing fixed-capacity ring buffers using modular arithmetic for zero-allocation $\mathcal{O}(1)$ queues and double-ended deques.
- **Monotonic Deque Window Optimization:** Maintaining elements in monotonic decreasing/increasing order within a sliding window to achieve $\mathcal{O}(1)$ amortized extrema queries in $\mathcal{O}(N)$ total time.
- **Dual Deque Difference Maintenance:** Tracking simultaneous minimum and maximum values over an expanding/contracting subarray window to satisfy strict limit constraints.
- **Level-by-Level Tree Traversal (BFS):** Processing hierarchical tree nodes level-by-level using size-bounded queue iterations in $\mathcal{O}(N)$ time and $\mathcal{O}(W)$ space.
- **Greedy Task Interval Scheduling:** Structuring task frequencies into idle-slot chunks to compute optimal CPU scheduling intervals.

<br/>

---

## 📋 Problem Directory & Performance

| # | Problem Title | Tier | Key Pattern / Concept | Time | Space | Performance (Beats) | Solution | Notes |
| :---: | :--- | :---: | :--- | :---: | :---: | :---: | :---: | :---: |
| `0102` | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | BFS / Queue Level-Order Traversal | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 1 ms (95.86%)` | [solution.java](0102-binary-tree-level-order-traversal/solution.java) | [README.md](0102-binary-tree-level-order-traversal/README.md) |
| `0199` | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | BFS Level-Order (Rightmost Node) | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 1 ms (70.63%)` | [solution.java](0199-binary-tree-right-side-view/solution.java) | [README.md](0199-binary-tree-right-side-view/README.md) |
| `0225` | [Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Single FIFO Queue Cycle Rotation | $\mathcal{O}(N)$ push / $\mathcal{O}(1)$ pop | $\mathcal{O}(N)$ | `⚡ 1 ms (82.98%)` | [solution.java](0225-implement-stack-using-queues/solution.java) | [README.md](0225-implement-stack-using-queues/README.md) |
| `0239` | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | ![Hard](https://img.shields.io/badge/🔴_Hard-ef4444?style=flat-square&labelColor=0d1117) | Monotonic Decreasing Deque (Indices) | $\mathcal{O}(N)$ | $\mathcal{O}(k)$ | `42 ms (14.62%)` | [solution.java](0239-sliding-window-maximum/solution.java) | [README.md](0239-sliding-window-maximum/README.md) |
| `0621` | [Task Scheduler](https://leetcode.com/problems/task-scheduler/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Frequency Sorting & Greedy Interval Math | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | `⚡ 4 ms (73.16%)` | [solution.java](0621-task-scheduler/solution.java) | [README.md](0621-task-scheduler/README.md) |
| `0622` | [Design Circular Queue](https://leetcode.com/problems/design-circular-queue/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Ring Buffer FIFO Array Implementation | $\mathcal{O}(1)$ all ops | $\mathcal{O}(K)$ | `⚡ 4 ms (100.00%)` | [solution.java](0622-design-circular-queue/solution.java) | [README.md](0622-design-circular-queue/README.md) |
| `0641` | [Design Circular Deque](https://leetcode.com/problems/design-circular-deque/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Modular Arithmetic Circular Deque | $\mathcal{O}(1)$ all ops | $\mathcal{O}(K)$ | `⚡ 5 ms (85.78%)` | [solution.java](0641-design-circular-deque/solution.java) | [README.md](0641-design-circular-deque/README.md) |
| `0933` | [Number of Recent Calls](https://leetcode.com/problems/number-of-recent-calls/) | ![Easy](https://img.shields.io/badge/🟢_Easy-10b981?style=flat-square&labelColor=0d1117) | Sliding Time Frame with FIFO Queue | $\mathcal{O}(1)^*$ amortized | $\mathcal{O}(W)$ | `24 ms (14.03%)` | [solution.java](0933-number-of-recent-calls/solution.java) | [README.md](0933-number-of-recent-calls/README.md) |
| `1438` | [Longest Continuous Subarray With Diff Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | ![Medium](https://img.shields.io/badge/🟡_Medium-f59e0b?style=flat-square&labelColor=0d1117) | Sliding Window + Dual Monotonic Deques | $\mathcal{O}(N)$ | $\mathcal{O}(N)$ | `⚡ 28 ms (98.47%)` | [solution.java](1438-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/solution.java) | [README.md](1438-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/README.md) |

<br/>

---

## 💡 Pattern Deep Dive & Cheat Sheet

### 1. Circular Ring Buffer Pointer Mechanics (`0622`, `0641`)
- Avoid dynamic memory allocations by wrapping pointers using modulo capacity $K$:
  - `enQueue / insertLast`: `rear = (rear + 1) % capacity`
  - `insertFront`: `front = (front - 1 + capacity) % capacity`
  - `deQueue / deleteFront`: `front = (front + 1) % capacity`
  - `deleteLast`: `rear = (rear - 1 + capacity) % capacity`
- Track `size` explicitly to decouple empty condition (`size == 0`) from full condition (`size == capacity`).

### 2. Monotonic Deque for Sliding Window Maximum (`0239`)
- Store array **indices** in `ArrayDeque<Integer>`.
- Maintain strictly decreasing value invariant: before pushing index `i`, pop all indices from the back whose values $\le \text{nums}[i]$.
- Expire elements outside the current window: if `deque.peekFirst() == i - k`, remove front.
- Front element is guaranteed to be the maximum of the window `[i - k + 1, i]`.

```java
Deque<Integer> q = new ArrayDeque<>();
for (int i = 0; i < nums.length; i++) {
    while (!q.isEmpty() && nums[q.peekLast()] <= nums[i]) {
        q.pollLast();
    }
    q.offerLast(i);
    if (q.peekFirst() == i - k) {
        q.pollFirst();
    }
    if (i >= k - 1) {
        res.add(nums[q.peekFirst()]);
    }
}
```

### 3. Dual Monotonic Deques for Limit Windows (`1438`)
- Maintain two deques: `maxDeque` (decreasing order) and `minDeque` (increasing order).
- Current window range difference is `nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()]`.
- If difference exceeds `limit`, increment left pointer and evict expired indices from the fronts of both deques.

### 4. Level-Order Tree BFS (`0102`, `0199`)
- Snapshot `int size = queue.size()` at the top of each level loop to process all nodes of the current depth before moving to the next.
- For Right Side View (`0199`), capture node value when `i == size - 1`.

```java
Queue<TreeNode> q = new LinkedList<>();
if (root != null) q.offer(root);
while (!q.isEmpty()) {
    int levelSize = q.size();
    for (int i = 0; i < levelSize; i++) {
        TreeNode curr = q.poll();
        if (i == levelSize - 1) rightView.add(curr.val);
        if (curr.left != null) q.offer(curr.left);
        if (curr.right != null) q.offer(curr.right);
    }
}
```

<br/>

---

## 🔍 Per-Problem Analytical Breakdown

### `0102` • Binary Tree Level Order Traversal
- **Concept:** Breadth-first search using a FIFO queue. Record level snapshots by looping over queue size.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$ for output & queue.
- **Edge Cases:** Empty root (`null`), single node tree, skewed/degenerate trees.

### `0199` • Binary Tree Right Side View
- **Concept:** BFS level traversal capturing the last element (`i == size - 1`) of each level queue batch.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$ max width queue.
- **Edge Cases:** Left-heavy tree (left child still visible if no right sibling exists at that level), empty tree.

### `0225` • Implement Stack using Queues
- **Concept:** Single queue rotation on `push`: enqueue value and rotate previous $N$ elements behind it (`q.offer(q.poll())`), ensuring $\mathcal{O}(1)$ LIFO `pop`.
- **Complexity:** Time: $\mathcal{O}(N)$ push, $\mathcal{O}(1)$ pop/top | Space: $\mathcal{O}(N)$.
- **Edge Cases:** Repeated push-pop sequences, single element operations.

### `0239` • Sliding Window Maximum
- **Concept:** Monotonic decreasing index deque providing $\mathcal{O}(1)$ maximum lookup per window slide.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(k)$ deque capacity.
- **Edge Cases:** $k = 1$, $k = N$, strictly increasing array, strictly decreasing array.

### `0621` • Task Scheduler
- **Concept:** Frequency counting math: max frequency task forms the frame `(maxFreq - 1) * (n + 1) + maxCount`. Max of frame size and total tasks gives the result.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(1)$ (fixed 26-element array).
- **Edge Cases:** $n = 0$ (no idling needed), all tasks identical, tasks more numerous than required idle intervals.

### `0622` • Design Circular Queue
- **Concept:** Array-backed ring buffer tracking `front`, `rear`, and `size` with modulo incrementing.
- **Complexity:** Time: $\mathcal{O}(1)$ for all operations | Space: $\mathcal{O}(K)$.
- **Edge Cases:** Operations on empty queue, enqueuing to full queue, wraparound over array boundary.

### `0641` • Design Circular Deque
- **Concept:** Fixed-array double-ended circular buffer with bidirectional modulo pointer arithmetic.
- **Complexity:** Time: $\mathcal{O}(1)$ for all operations | Space: $\mathcal{O}(K)$.
- **Edge Cases:** Mixed front/rear insertions and deletions, boundary wrap with negative offset `(front - 1 + capacity) % capacity`.

### `0933` • Number of Recent Calls
- **Concept:** Sliding time window with a queue. Enqueue new timestamp $t$, poll all timestamps $< t - 3000$, and return queue size.
- **Complexity:** Time: $\mathcal{O}(1)$ amortized per call (each timestamp added and removed at most once) | Space: $\mathcal{O}(W)$ where $W \le 3000$.
- **Edge Cases:** Calls spaced $> 3000$ ms apart, bursts of calls within same millisecond.

### `1438` • Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
- **Concept:** Sliding window maintained by two monotonic deques tracking current window maximum and minimum.
- **Complexity:** Time: $\mathcal{O}(N)$ | Space: $\mathcal{O}(N)$.
- **Edge Cases:** `limit = 0` (longest subarray of identical values), whole array satisfies condition, single element.

<br/>

---

<div align="center">

[⬅️ Back to Main Repository](../README.md)

</div>
