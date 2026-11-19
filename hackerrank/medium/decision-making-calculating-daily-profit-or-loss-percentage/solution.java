import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Invalid Input");
        } else if (a == b) {
            System.out.println("No Profit, No Loss");
        } else if (b > a) {
            int pct = ((b - a) * 100) / a;
            System.out.println("Profit - " + pct + "%");
        } else {
            int pct = ((a - b) * 100) / a;
            System.out.println("Loss - " + pct + "%");
        }
    }
}
