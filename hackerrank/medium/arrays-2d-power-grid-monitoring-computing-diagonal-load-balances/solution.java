import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]a = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        } 
        int primary = 0;
        int secondary = 0;
               
        for(int i=0;i<n;i++){
            primary = primary +a[i][i];
            secondary = secondary+a[i][n-1-i];
            
        }
        System.out.println(primary + " " + secondary);
    }
}
