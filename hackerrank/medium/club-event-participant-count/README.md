# Club Event Participant Count

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The Campus Tech Club is organizing a coding event. Each participant who registers is given a sequential token number starting from 1. The club wants to display all token numbers on the screen as they are generated.

Write a Java program that reads an integer N, representing the total number of participants registered for the event. Print all token numbers from 1 to N, each on a new line.

 **Input Format** 

A single integer N.

 **Constraints** 

1 <= N <= 100

 **Output Format** 

Print N lines. The i-th line should contain the integer i (for 1 <= i <= N).

 **Sample Input 0** 

```
1

```

 **Sample Output 0** 

```
1

```

 **Sample Input 1** 

```
2

```

 **Sample Output 1** 

```
1
2

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T06:40:19.704Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =1;i<=N;i++){
            System.out.println(i);
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/club-event-participant-count/problem)