# Simple interest 47

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Create a class named Interest.

The Interest class should contain three integer data members:

- principal
- rate
- time

The class should contain a method:

calculateInterest() - calculates and prints the simple interest.

Use the formula:

Simple Interest = (principal × rate × time) / 100

In the main method, create an object of the Interest class, assign the given input values to the data members, and call the calculateInterest() method.

If any input is outside the given constraints, print:

Invalid Input

Write the complete Java program, including the main method and input handling.

 **Input Format** 

The input contains three integers:

principal rate time

 **Constraints** 

1 <= principal <= 1000000 1 <= rate <= 100 1 <= time <= 50

 **Output Format** 

Print the simple interest in the following format:

Simple Interest:

 **Sample Input 0** 

```
10000
5
2

```

 **Sample Output 0** 

```
Simple Interest: 1000

```

 **Sample Input 1** 

```
0
5
2

```

 **Sample Output 1** 

```
Invalid Input

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T12:58:32.502Z  

```java
import java.io.*;
import java.util.*;
class Interest{
    int principal;
    int rate;
    int time;
    public void calculateInterest(){
        int simple = (principal*rate*time)/100;
        System.out.println("Simple Interest: "+simple);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Interest i = new Interest();
        i.principal = sc.nextInt();
        i.rate = sc.nextInt();
        i.time = sc.nextInt();
        if(1>i.principal||i.principal>1000000||1>i.rate||i.rate>100||1>i.time||i.time>50){
            System.out.println("Invalid Input");
            return;
        }
        i.calculateInterest();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/simple-interest-47-1/problem)