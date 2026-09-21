# Problem-2 23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Create a class named Employee that represents an employee.

The Employee class should contain two data members:

- name
- salary

It should contain a method displayEmployee() that prints the employee's name and salary.

Create another class named Manager that inherits from Employee.

The Manager class should contain one additional data member:

- bonus

It should contain a method displayManager() that calculates and prints the manager's total salary.

Total Salary = salary + bonus

In the main method, create an object of Manager, assign the given input values, and call both displayEmployee() and displayManager().

Write the complete Java program, including the main method and input handling.

 **Input Format** 

The input contains three values:

name salary bonus

 **Constraints** 

1 <= salary <= 1000000 0 <= bonus <= 500000

 **Output Format** 

Print the employee details and total salary in the following format:

Name: Salary: Total Salary:

 **Sample Input 0** 

```
Ravi
50000
10000

```

 **Sample Output 0** 

```
Name: Ravi
Salary: 50000
Total Salary: 60000

```

 **Sample Input 1** 

```
Priya
50000
-1

```

 **Sample Output 1** 

```
Invalid Input

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T12:32:27.915Z  

```java
import java.io.*;
import java.util.*;

class Employee {
    String name;
    int salary;

    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int bonus;

    public void displayManager() {
        int Total_Salary = salary + bonus;
        System.out.println("Total Salary: " + Total_Salary);
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        m.name = sc.next();
        m.salary = sc.nextInt();
        m.bonus = sc.nextInt();

        if (m.salary <= 1 || m.salary > 1000000 ||
            m.bonus <= 1 || m.bonus > 5000000) {

            System.out.println("Invalid Input");
            return;
        }

        m.displayEmployee();
        m.displayManager();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/problem-2-23-5/problem)