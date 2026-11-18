import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        float interest = (a * b * c) / 100;
        float amount = interest + a;
        float dis = 0.02f * interest; // 2% discount on the interest
        float fin = amount - dis;
        
        System.out.printf("Interest: %.2f\nTotal Amount: %.2f\nDiscount: %.2f\nFinal Settlement Amount: %.2f\n", interest, amount, dis, fin);
    }
}
