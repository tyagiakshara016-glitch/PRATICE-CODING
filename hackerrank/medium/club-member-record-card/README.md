# Club Member Record Card

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Create a Java class named Member with the following data members: - String name - int memberId - String branch

In the main method: 1. Create an object of Member. 2. Assign values to its data members. 3. Print the member details in the exact format shown below.

Use these values: - name = "Arun" - memberId = 101 - branch = "CSE"

 **Input Format** 

No input. Hard-code the values in the program.

 **Constraints** 

NA

 **Output Format** 

Name: Arun Member ID: 101 Branch: CSE

 **Sample Input 0** 

```
No input

```

 **Sample Output 0** 

```
Name: Arun
Member ID: 101
Branch: CSE

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T06:44:14.430Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String name = "Arun";
        int memberID = 101;
        String branch = "CSE";
        System.out.println("Name: "+name);
        System.out.println("Member ID: "+memberID);
        System.out.println("Branch: "+branch);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/club-member-record-card/problem)