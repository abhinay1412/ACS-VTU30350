import java.util.*; // Include Stack and Map

public class Solution {
    public boolean isValid(String s) {
        // 1. Stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        
        // 2. Map to match closing → opening brackets
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        // 3. Process each character
        for (char c : s.toCharArray()) {
            // If NOT a closing bracket → push to stack
            if (!map.containsKey(c)) {
                stack.push(c);
            }
            // If IS a closing bracket → check match
            else if (!stack.isEmpty() && stack.pop() != map.get(c)) {
                return false;
            }
        }
        
        // 4. Final check - all brackets closed?
        return stack.isEmpty();
    }
}