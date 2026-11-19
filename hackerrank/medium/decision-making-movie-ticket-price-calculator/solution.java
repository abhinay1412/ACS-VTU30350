import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double time = sc.nextDouble();
        if (time == 13.30 || age <= 13) {
            System.out.println("$2.00");
        } else {
            System.out.println("$5.00");
        }
    }
}
