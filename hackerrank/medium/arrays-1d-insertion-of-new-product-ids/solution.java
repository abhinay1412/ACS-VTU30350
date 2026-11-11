import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        arr[n] = sc.nextInt();
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}
