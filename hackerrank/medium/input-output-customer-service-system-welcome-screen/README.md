# Input & Output - Customer Service System Welcome Screen

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Imagine you're developing a customer service console-based application that greets each customer with a personalized message when they log in. The program should retrieve the customer's name and display a friendly welcome message. This interaction helps customers feel acknowledged as they begin their service session. The message should display "Welcome" followed by the user's name, formatted neatly with a tab space in between.

In this customer service system, when a user logs in, the system should greet them with a personalized message. For example, if the user’s name is "John", the system should display "Welcome John", where there is a tab space between "Welcome" and "John". This mimics a real-time scenario where personalized greetings make interactions with automated systems more user-friendly and professional.

Write a program that prints a welcome message to the user. The message should be in the format: "Welcome [username]", where the username is printed after a tab space.

 **Input Format** 

The user will input their name as a string.

 **Constraints** 

NA

 **Output Format** 

The system should output "Welcome [username]", with a tab space separating the word "Welcome" and the user's name.

 **Sample Input 0** 

```
Tamilarasan

```

 **Sample Output 0** 

```
Welcome    Tamilarasan

```

 **Sample Input 1** 

```
Alice

```

 **Sample Output 1** 

```
Welcome    Alice

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T15:13:11.715Z  

```java
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Harsha = sc.nextLine();
        System.out.println("Welcome\t" + Harsha);
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/input-output-customer-service-system-welcome-screen/problem)