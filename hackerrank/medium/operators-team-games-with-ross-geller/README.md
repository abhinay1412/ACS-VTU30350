# Operators - Team Games with Ross Geller

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Ross Geller, a paleontologist and a member of the beloved group from the sitcom Friends, decides to organize a weekend full of fun and engaging team games with his friends. Eager to make the most of this gathering, he plans to split his friends into equal-sized teams. However, Ross quickly realizes that managing a large group can be tricky, especially when the number of friends doesn't evenly divide by the number of teams he wants to create.

To ensure that everyone has a fair chance to participate and to keep the games organized, Ross wants to know exactly how many friends can be placed in each team, as well as how many friends will be left without a team. This way, he can utilize the left-out friends as assistants for organizing and managing the games, ensuring that everyone still has a role to play.

You are tasked with writing a program to help Ross calculate the number of friends in each team and how many will be left out after forming the teams.

 **Input Format** 

The program will receive two integers:

- The first integer represents the total number of friends Ross has.
- The second integer represents the number of teams he wants to form.

 **Constraints** 

NA

 **Output Format** 

The program should output a statement indicating:

- The number of friends in each team.
- The number of friends left out.

 **Sample Input 0** 

```
60
8

```

 **Sample Output 0** 

```
The number of friends in each team is 7 and left out is 4

```

 **Explanation 0** 

- Ross has 60 friends and he wants to split them into 8 teams.
- If 60 friends are divided into 8 teams, each team will have 7 friends (60 // 8 = 7).
- There will be 4 friends left out (60 % 8 = 4), who will assist Ross in managing the games.

 **Sample Input 1** 

```
45
6

```

 **Sample Output 1** 

```
The number of friends in each team is 7 and left out is 3

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T17:43:48.828Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The number of friends in each team is " +a/b + " and left out is " + a%b);

        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/operators-team-games-with-ross-geller/problem)