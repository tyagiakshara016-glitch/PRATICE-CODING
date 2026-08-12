# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 23.09%)  
**Memory:** 48 MB (beats 94.72%)  
**Submitted:** 2026-08-12T17:35:00.651Z  

```java
class Solution {
    public void reverseString(char[] s) {
        char[] rev=new char[s.length];
        int a=0;
       for(int i=s.length-1;i>=0;i--){
        rev[a]=s[i];
        a++;
       }
       for(int i=0;i<s.length;i++){
        s[i]=rev[i];
       }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)