import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int S = sc.nextInt();
        int D = sc.nextInt();
        int N = sc.nextInt();
        double diff = S-D;
        double rnd = diff/N;
        System.out.println(Math.round(rnd));
    }
}
