import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int to_insert = sc.nextInt();
        int i=n-1;
        while (i>=0 && arr[i]>to_insert){
            arr[i+1]=arr[i];
            i--;
        }
        arr[i+1]=to_insert;
        for(int j=0;j<=n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
