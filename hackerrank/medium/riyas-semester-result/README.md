# Riya's Semester Result

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Riya has completed three Java assessments. Her faculty wants to calculate her combined score using a simple Java class.

Create a class named StudentResult.

The StudentResult class should contain three integer data members:

assessment1 assessment2 assessment3

The class should contain a method:

calculateTotal() – calculates and prints the total marks obtained by Riya.

Use the formula:

Total Marks = assessment1 + assessment2 + assessment3

In the main method, create an object of the StudentResult class, assign the given input values to its data members, and call the calculateTotal() method.

If any assessment mark is outside the given constraints, print:

Invalid Input

Write the complete Java program, including the main method and input handling.

 **Input Format** 

The input contains three space-separated integers:

assessment1 assessment2 assessment3

 **Constraints** 

0 ≤ assessment1 ≤ 100 0 ≤ assessment2 ≤ 100 0 ≤ assessment3 ≤ 100

 **Output Format** 

Print the total marks in the following format:

Total Marks: X

Here, X represents the sum of the three assessment marks.

If any input is invalid, print:

Invalid Input

 **Sample Input 0** 

```
75 80 65

```

 **Sample Output 0** 

```
Total Marks: 220

```

 **Explanation 0** 

Riya’s total marks are:

75 + 80 + 65 = 220

 **Sample Input 1** 

```
100 90 85

```

 **Sample Output 1** 

```
Total Marks: 275

```

 **Sample Input 2** 

```
75 110 80

```

 **Sample Output 2** 

```
Invalid Input

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T06:21:55.073Z  

```java
import java.io.*;
import java.util.*;

class StudentResult{
    int assessment1;
    int assessment2;
    int  assessment3;
    void calculateTotal(){
        int Total_Marks = assessment1 + assessment2 + assessment3;
        System.out.print("Total Marks: "+Total_Marks);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        StudentResult s = new StudentResult();
        s.assessment1 = sc.nextInt();
        s.assessment2=sc.nextInt();
        s.assessment3=sc.nextInt();
        if(s.assessment1>100||s.assessment1<0||s.assessment2<0||s.assessment2>100||s.assessment3<0||s.assessment3>100){
            System.out.print("Invalid Input");
            return;
        }
        s.calculateTotal();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/riyas-semester-result/problem)