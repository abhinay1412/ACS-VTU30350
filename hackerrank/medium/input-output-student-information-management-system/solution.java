import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        float cgpa = sc.nextFloat();
        char grade = sc.next().charAt(0);
        
        float truncatedCgpa = (int)(cgpa * 100) / 100.0f;
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f\n", truncatedCgpa);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
