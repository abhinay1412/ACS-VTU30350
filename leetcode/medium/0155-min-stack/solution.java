class MinStack {
    private int[] stack;
    private int[] minStack;
    private int topIndex;

    public MinStack() {
        stack = new int[30000];
        minStack = new int[30000];
        topIndex = -1;
    }

    public void push(int val) {
        topIndex++;
        stack[topIndex] = val;
        if (topIndex == 0) {
            minStack[topIndex] = val;
        } else {
            minStack[topIndex] = Math.min(val, minStack[topIndex - 1]);
        }
    }

    public void pop() {
        topIndex--;
    }

    public int top() {
        return stack[topIndex];
    }

    public int getMin() {
        return minStack[topIndex];
    }
}