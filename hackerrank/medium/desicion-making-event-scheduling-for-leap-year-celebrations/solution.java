import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        
        if ((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0)) {
            System.out.println("Schedule Event");
        } else {
            System.out.println("No Event This Year");
        }
        
        sc.close();
    }
}
