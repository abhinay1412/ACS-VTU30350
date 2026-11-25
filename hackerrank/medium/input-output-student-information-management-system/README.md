# Input & Output - Student Information Management System

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are developing a Student Information Management System for a school or university. This system allows administrators or teachers to enter and display the details of students easily. Each student has specific attributes, including their name, age, CGPA, and grade. The system will print these details in a user-friendly format when the information is entered. In this scenario, the program prompts the user to input the student's details: name (string), age (integer), CGPA (float), and grade (character). After collecting this information, the program will display the details in a structured format. The CGPA must be formatted to two decimal places to ensure readability and accuracy.

 **Input Format** 

The input consists of: A string representing the student's name. An integer representing the student's age. A float representing the student's CGPA. A character representing the student's grade.

 **Constraints** 

NA

 **Output Format** 

The program should output the student’s details in the following format:

Name: [name]

Age: [age]

CGPA: [CGPA]

Grade: [grade]

 **Sample Input 0** 

```
Rajeev
20
8.6467
B

```

 **Sample Output 0** 

```
Name: Rajeev
Age: 20
CGPA: 8.64
Grade: B

```

 **Sample Input 1** 

```
Alice
22
9.7564
A

```

 **Sample Output 1** 

```
Name: Alice
Age: 22
CGPA: 9.75
Grade: A

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T07:06:23.658Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/input-output-student-information-management-system/problem)