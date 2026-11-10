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
        int cnt = 0;
        int a[]= new int[n];
        for(int i = 0; i<n; i++){
            if(sc.nextInt()%3==0){
                cnt++;
                
            }
        }
        System.out.println(cnt);
    }
}
