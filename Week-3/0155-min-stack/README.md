# Min Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the `MinStack` class:

- MinStack() initializes the stack object.
- void push(int value) pushes the element value onto the stack.
- void pop() removes the element on the top of the stack.
- int top() gets the top element of the stack.
- int getMin() retrieves the minimum element in the stack.

You must implement a solution with `O(1)` time complexity for each function.

 

 **Example 1:** 

```
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2

```

 

 **Constraints:** 

- -231 <= val <= 231 - 1
- Methods pop, top and getMin operations will always be called on non-empty stacks.
- At most 3 * 104 calls will be made to push, pop, top, and getMin.

## Solution

**Language:** Java  
**Runtime:** 34 ms (beats 61.77%)  
**Memory:** 99.8 MB (beats 76.58%)  
**Submitted:** 2026-08-27T03:37:19.799Z  

```java
class MinStack {
    Stack<Integer> s = new Stack<>(), st = new Stack<>();
    public void push(int val) {
        s.push(val);
        if (st.isEmpty() || val <= st.peek()) st.push(val);
    }
    public void pop() {
        if (s.peek().equals(st.peek())) st.pop();
        s.pop();
    }
    public int top() { return s.isEmpty() ? -1 : s.peek(); }
    public int getMin() { return st.isEmpty() ? -1 : st.peek(); }
}
```

---

[View on LeetCode](https://leetcode.com/problems/min-stack/)