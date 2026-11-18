# Operators - Leena's Business Loan

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Leena has always dreamed of starting her own business, and she finally put together a compelling business proposal. After discussing her idea with her friend, she was introduced to Meena, a successful owner of a construction company who was interested in supporting emerging entrepreneurs. Meena, impressed by Leena's proposal, agreed to invest in her business by providing a loan.

Meena offers Leena a loan of Rs. X for Y years at an interest rate of R% per annum. The deal is that Leena will have to repay the loan along with the interest accrued over the years. However, as an additional incentive, Meena promises a 2% discount on the total interest if Leena successfully repays the loan. Leena is thrilled about the opportunity but needs help calculating:

- The total interest she'll owe.
- The total amount she has to repay (principal + interest).
- The discount on the interest, as per the offer.
- The final amount after applying the discount.

Given the principal amount X, the rate of interest R%, and the loan period in years Y, write a program to:

- Calculate the total interest payable by Leena.
- Calculate the total amount (principal + interest).
- Calculate the discount on the interest (2% of the interest).
- Calculate the final amount Leena needs to repay after applying the discount.
- All values must be formatted to two decimal places.

 **Input Format** 

The input consists of three floating-point values:

- The first value corresponds to the principal amount borrowed by Leena (Rs. X).
- The second value corresponds to the rate of interest (R%).
- The third value corresponds to the loan period in years (Y).

 **Constraints** 

NA

 **Output Format** 

The output consists of four floating-point values, each formatted to two decimal places:

- The interest.
- The total amount (principal + interest).
- The discount on the interest.
- The final settlement amount after applying the discount.

 **Sample Input 0** 

```
100
1
10

```

 **Sample Output 0** 

```
Interest: 10.00
Total Amount: 110.00
Discount: 0.20
Final Settlement Amount: 109.80

```

 **Explanation 0** 

 **Interest Calculation:** 

- This formula calculates the total interest that Leena will owe over the entire loan period. For example, if Leena borrows Rs. 100 at a rate of 1% for 10 years, the interest will be calculated as:
- Interest = (100  *1*  10) / 100 = 10.00
- This means Leena will owe Rs. 10 in interest after 10 years.

 **Total Amount Calculation:** 

- This calculates the total amount Leena will need to repay to Meena after 10 years. Continuing with our example:
- Total Amount = 100 + 10 = 110.00
- Therefore, the total amount Leena will repay after 10 years is Rs. 110.

 **Discount Calculation:** 

- Since Meena offers a 2% discount on the total interest, we calculate how much this discount is. For our example:
- Discount = 0.02 * 10 = 0.20
- This indicates that Leena will receive a Rs. 0.20 discount on the interest.

 **Final Settlement Calculation:** 

- The final settlement amount is the total amount to be paid after applying the discount. Using our figures:
- Final Settlement = 110 - 0.20 = 109.80
- Thus, the final amount Leena needs to repay after applying the discount is Rs. 109.80.

 **Sample Input 1** 

```
2000
5
8

```

 **Sample Output 1** 

```
Interest: 800.00
Total Amount: 2800.00
Discount: 16.00
Final Settlement Amount: 2784.00

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T18:23:57.631Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/operators-leenas-business-loan/problem)