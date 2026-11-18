import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        System.out.println("Square Root of first number: " + Math.sqrt(a));
        System.out.println("First number raised to the power of second number: " + Math.pow(a, b));
        System.out.println("Absolute value of first number: " + Math.abs(a));
        System.out.println("Absolute value of second number: " + Math.abs(b));
    }
}
