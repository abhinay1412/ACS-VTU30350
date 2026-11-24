import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        StringBuilder lower = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n && i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                lower.append(ch);
                count++;
            }
        }
        System.out.println(lower.toString() + " " + count);
    }
}
