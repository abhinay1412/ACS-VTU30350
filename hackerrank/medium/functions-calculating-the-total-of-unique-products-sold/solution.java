import java.util.*;

public class Solution {
    static int SumUniqueElements(int[] arr, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j]) count++;
            }
            if (count == 1) sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(SumUniqueElements(arr, n));
    }
}
