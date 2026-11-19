import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int a;
        if((s1>=s2&&s1<=s3)||(s1<=s2&&s1>=s3)){
            a = s1;
        }else if((s2>=s1&&s2<=s3)||(s2<=s1&&s2>=s3)){
            a = s2;
        }else{
            a=s3;
        }
        System.out.println(a);
    }
}
