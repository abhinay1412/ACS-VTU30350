public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );
        
        for (char c : s.toCharArray()) {
            // Opening bracket → push to stack
            if (!map.containsKey(c)) {
                stack.push(c);
            } 
            // Closing bracket → check match
            else if (!stack.isEmpty() && stack.pop() != map.get(c)) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}