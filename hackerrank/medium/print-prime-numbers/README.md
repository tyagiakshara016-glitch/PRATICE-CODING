# Employee Salaries

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a query to print all *prime numbers* less than or equal to $1000$. Print your result on a single line, and use the ampersand ($\&$) character as your separator (instead of a space).


For example, the output for all prime numbers $\leq 10$ would be:

	2&3&5&7

**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T11:32:31.987Z  

```sql
/*
Enter your query here.
*/
SELECT name
FROM Employee
WHERE salary > 2000
  AND months < 10
ORDER BY employee_id ASC;

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/print-prime-numbers/problem)