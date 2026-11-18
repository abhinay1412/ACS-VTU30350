# Input & Output - Gym Membership Registration System

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you are developing a Gym Membership Registration System for a fitness center. When a new user wants to join the gym, they are required to provide their personal details for registration. The user is prompted to input their name and select a membership plan, such as "Monthly" or "Yearly". After the user enters their information, the system confirms the details by displaying them in a well-formatted output.

This type of program is often used in registration systems for gyms, fitness centers, or sports clubs. It ensures that the member's name and the type of membership are clearly presented so that the gym's staff can verify the registration process.

The task is to create a console-based application that collects the user's name and the membership type (such as "Monthly" or "Yearly"). The program should immediately display the information after it is entered, confirming the user’s registration in a clean, readable format.

 **Input Format** 

The program will prompt the user to input:

- A string representing the user's name.
- A string representing the selected membership type (e.g., "Monthly", "Yearly").

 **Constraints** 

NA

 **Output Format** 

The program will print:

- The user's name.
- The selected membership type.

 **Sample Input 0** 

```
John Doe
Monthly

```

 **Sample Output 0** 

```
Member Name: John Doe
Selected Membership: Monthly

```

 **Sample Input 1** 

```
Alice Smith
Yearly

```

 **Sample Output 1** 

```
Member Name: Alice Smith
Selected Membership: Yearly

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:03:57.062Z  

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String membership_type = sc.nextLine();
        System.out.println("Member Name:" +" "+name);
        System.out.println("Selected Membership:"+" "+membership_type);
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/input-output-gym-membership-registration-system/problem)