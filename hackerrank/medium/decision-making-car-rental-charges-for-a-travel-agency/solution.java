import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int N = sc.nextInt();
        int R2 = sc.nextInt();
        int X = sc.nextInt();
        int t_hrs = (int) Math.ceil(X / 60.0);
        int fh_cost = R1*N;
        int rmg = t_hrs -N;
        int cost = rmg*R2;
        System.out.println(fh_cost+cost); 
        
    }
}
