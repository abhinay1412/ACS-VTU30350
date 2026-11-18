# Input & Output - User Registration System

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are developing a User Registration System for an online platform where users need to register by providing their age and name. The system needs to collect and store these details for each user to manage their profile. The age will be used to verify the eligibility of the user, while the name will be stored for identification purposes.

In this scenario, the program prompts the user to input their age (as an integer) and their name (as a string). After collecting the inputs, the program prints the details in a user-friendly format. This functionality is useful for applications that require user registration, such as e-commerce platforms, social media, or any online service that needs user identification and verification.

 **Input Format** 

The input consists of:

- An integer representing the user's age.
- A string representing the user's name.

 **Constraints** 

NA

 **Output Format** 

The output should print the user's age and name in a structured format.

 **Sample Input 0** 

```
25
Alice

```

 **Sample Output 0** 

```
User Details:
Name: Alice
Age: 25

```

 **Sample Input 1** 

```
18
John

```

 **Sample Output 1** 

```
User Details:
Name: John
Age: 18

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T15:55:00.600Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine(); 
        String name = sc.nextLine();
        
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/input-output-user-registration-system/problem)