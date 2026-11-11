import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        boolean flag = true;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        
        if (flag) {
            System.out.println("Upper triangular matrix");
        } else {
            System.out.println("Not an Upper triangular matrix");
        }
        
        sc.close();
    }
}
