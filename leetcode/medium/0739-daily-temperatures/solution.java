class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] answer = new int[n];

        // Use an array to simulate a stack.
        // The stack stores indices instead of temperatures.
        int[] stack = new int[n];
        int top = -1;

        // Traverse every day's temperature.
        for (int i = 0; i < n; i++) {

            // If today's temperature is warmer than the day on top of the stack,
            // we have found the answer for that previous day.
            while (top >= 0 &&
                   temperatures[i] > temperatures[stack[top]]) {

                // Get the previous day's index.
                int previousDay = stack[top--];

                // The waiting time is the distance between the two indices.
                answer[previousDay] = i - previousDay;
            }

            // Today's temperature has not found a warmer future day yet,
            // so put its index into the stack.
            stack[++top] = i;
        }

        return answer;
    }
}