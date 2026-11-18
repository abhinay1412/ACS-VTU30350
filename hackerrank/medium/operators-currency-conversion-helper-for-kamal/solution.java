import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int dollar1 = sc.nextInt();
        int cent1 = sc.nextInt();
        int dollar2 = sc.nextInt();
        int cent2 = sc.nextInt();
        int sum1 = dollar1 + dollar2;
        int sum2 = cent1 + cent2;
        int sum3 = sum2%100;
        int sum4 = sum2/100;
        int sum5 = sum1 + sum4;
        System.out.println(sum5);
        System.out.println(sum3);

    }
}
