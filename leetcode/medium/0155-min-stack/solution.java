class MinStack {
    Stack<Integer> s = new Stack<>(), st = new Stack<>();

    public MinStack() {}

    public void push(int val) {
        s.push(val);
        if (st.isEmpty() || val <= st.peek()) {
            st.push(val);
        }
    }

    public void pop() {
        if (s.peek().equals(st.peek())) {
            st.pop();
        }
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return st.peek();
    }
}