# problem-1 39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Create a class named Rectangle that represents a rectangle.

The Rectangle class should contain two integer data members:

- length
- breadth

The class should contain two methods:

- calculateArea() - calculates and prints the area of the rectangle.
- calculatePerimeter() - calculates and prints the perimeter of the rectangle.

The formulas are:

Area = length × breadth

Perimeter = 2 × (length + breadth)

In the main method, create an object of the Rectangle class, assign the given input values to length and breadth, and call both methods.

Write the complete Java program, including the main method and input handling.

 **Input Format** 

The input contains two integers:

length breadth

 **Constraints** 

1 <= length <= 1000 1 <= breadth <= 1000

 **Output Format** 

Print the area and perimeter of the rectangle in the following format:

Area: Perimeter:

 **Sample Input 0** 

```
10
5

```

 **Sample Output 0** 

```
Area: 50
Perimeter: 30

```

 **Sample Input 1** 

```
1
1

```

 **Sample Output 1** 

```
Area: 1
Perimeter: 4

```

 **Sample Input 2** 

```
1001
5

```

 **Sample Output 2** 

```
Invalid Input

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T12:16:11.162Z  

```java
import java.io.*;
import java.util.*;

class Rectangle{
    int length;
    int breadth;
    public void calculateArea(){
        int Area = length*breadth;
        System.out.println("Area: "+Area);
    }
    public void calculatePerimeter(){
        int Perimeter = 2*(length + breadth);
        System.out.println("Perimeter: "+Perimeter);
}
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        if (length < 1 || length > 1000 ||
            breadth < 1 || breadth > 1000) {
            System.out.println("Invalid Input");
            return;
        }
        Rectangle s = new Rectangle();
        s.length = length;
        s.breadth = breadth;
        
        s.calculateArea();
        s.calculatePerimeter();
        
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/problem-1-39-1/problem)