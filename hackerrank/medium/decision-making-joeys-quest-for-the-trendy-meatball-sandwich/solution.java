import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<100||n>999){
            System.out.println("Invalid Number");
        }else if(((n/10)%10)%3==0){
            System.out.println("Trendy Number");
        }else{
            System.out.println("Not a Trendy Number");
        }
        s.close();
    }
}
