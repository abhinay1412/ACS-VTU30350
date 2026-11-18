import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        
        if (M.equals("rock")) {
            System.out.println("Paper");
        } else if (M.equals("paper")) {
            System.out.println("Scissors");
        } else if (M.equals("scissors")) {
            System.out.println("Rock");
        }
        
        sc.close();
    }
}
