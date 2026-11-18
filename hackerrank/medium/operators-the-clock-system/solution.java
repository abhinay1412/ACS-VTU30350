import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int product = X * Y;
        int clockTime = ((product - 1) % 12) + 1;
        
        System.out.println(clockTime);
    }
}
