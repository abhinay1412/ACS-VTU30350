class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int i = 0;
        Stack<Integer> st = new Stack<>();
        while (i < n) {
            if (asteroids[i] > 0)
                st.push(asteroids[i]);
            else {
                if (st.isEmpty() || st.peek() < 0)
                    st.push(asteroids[i]);
                else if (Math.abs(st.peek()) == Math.abs(asteroids[i]))
                    st.pop();
                else if (Math.abs(st.peek()) < Math.abs(asteroids[i])) {
                    st.pop();
                    continue;
                }
            }
            i++;
        }
        int k = st.size();
        int[] arr = new int[k];
        k--;
        while (!st.isEmpty())
            arr[k--] = st.pop();
        return arr;
    }
}