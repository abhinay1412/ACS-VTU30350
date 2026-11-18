import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        
        int truncated = (int) f;
        int roundedUp = (int) Math.ceil(f);
        int roundedDown = (int) Math.floor(f);
        
        System.out.println(truncated);
        System.out.println(roundedUp);
        System.out.println(roundedDown);
    }
}
