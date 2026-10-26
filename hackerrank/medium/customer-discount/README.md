# Customer Discount

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

An online shopping platform provides discounts to its customers based on their membership type. Create a parent class named Customer with: - A string variable customerName. - An integer variable purchaseAmount. - A method calculateDiscount() that returns 5% of the purchase amount. Create a child class named PremiumCustomer that inherits from Customer. The PremiumCustomer class must override the calculateDiscount() method to return 15% of the purchase amount. In the main() method: 1. Read the customer type, customer name, and purchase amount. 2. Create either a Customer or PremiumCustomer object based on the customer type. 3. Store the object in a Customer reference. 4. Call calculateDiscount() using that reference. 5. Calculate and display the final amount after discount. If the customer type is not Regular or Premium, or the purchase amount is outside the given constraints, print Invalid Input.

 **Input Format** 

Customer type (Regular or Premium) Customer name Purchase amount

 **Constraints** 

Customer type must be Regular or Premium. 1 <= purchaseAmount <= 100000

 **Output Format** 

Customer: Discount: Final Amount:

 **Sample Input 0** 

```
Premium
Aarav
2000

```

 **Sample Output 0** 

```
Customer: Aarav
Discount: 300
Final Amount: 1700

```

 **Sample Input 1** 

```
Regular
Dev
-500

```

 **Sample Output 1** 

```
Invalid Input

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T08:49:50.781Z  

```java

import java.util.*;
class Customer {
    String customerName;
    int purchaseAmount;

    double calculateDiscount() {
        return purchaseAmount * 0.05;
    }
}
class PremiumCustomer extends Customer {
    @Override
    double calculateDiscount() {
        return purchaseAmount * 0.15;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        String name = sc.nextLine();
        int amount = sc.nextInt();
        if ((!type.equals("Regular") && !type.equals("Premium"))
                || amount < 1 || amount > 100000) {
            System.out.println("Invalid Input");
            return;
        }
        Customer c;
        if (type.equals("Regular")) {
            c = new Customer();
        } else {
            c = new PremiumCustomer();
        }
        c.customerName = name;
        c.purchaseAmount = amount;
        int discount = (int) c.calculateDiscount();
        int finalAmount = amount - discount;

        System.out.println("Customer: " + name);
        System.out.println("Discount: " +  discount);
        System.out.println("Final Amount: " +  finalAmount);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/customer-discount/problem)