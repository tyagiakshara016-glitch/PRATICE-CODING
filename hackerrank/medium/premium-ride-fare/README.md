# Premium Ride Fare

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Aarav books a premium cab to travel to college. The normal fare depends on the distance and fare per kilometre. A waiting charge of ₹2 per minute is added for a premium ride.

Create a parent class Ride with:

distance farePerKm A constructor A method calculateFare() to return the normal fare

Create a child class PremiumRide with:

waitingMinutes A constructor that uses super An overridden calculateFare() method

Use:

Normal Fare = distance × farePerKm Final Fare = Normal Fare + (waitingMinutes × 2)

Use super.calculateFare() inside the overridden method.

Create a PremiumRide object in the main method and print the final fare. If any input is outside the constraints, print Invalid Input.

Write the complete Java program with input handling.

 **Input Format** 

The input contains three space-separated integers: distance farePerKm waitingMinutes

 **Constraints** 

1 ≤ distance ≤ 500 1 ≤ farePerKm ≤ 100 0 ≤ waitingMinutes ≤ 180

 **Output Format** 

Print the final fare in the following format: Final Fare: X Here, X represents the total fare of the premium ride. If any input is outside the constraints, print: Invalid Input

 **Sample Input 0** 

```
10 15 5

```

 **Sample Output 0** 

```
Final Fare: 160

```

 **Explanation 0** 

Normal Fare = 10 × 15 = 150 Waiting Charge = 5 × 2 = 10 Final Fare = 150 + 10 = 160

 **Sample Input 1** 

```
25 12 0

```

 **Sample Output 1** 

```
Final Fare: 300

```

 **Explanation 1** 

Since the waiting time is zero, no waiting charge is added.

Final Fare = 25 × 12 = 300

 **Sample Input 2** 

```
8 20 15

```

 **Sample Output 2** 

```
Final Fare: 190

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T06:35:10.486Z  

```java
import java.io.*;
import java.util.*;

class Ride{
    int distance;
    int farePerKm;
    Ride(int distance,int farePerKm){
        this.distance = distance;
        this.farePerKm = farePerKm;
    }
    int calculateFare(){
        return distance * farePerKm;
    }
}
class PremiumRide extends Ride{
    int waitingMinutes;
    PremiumRide(int distance,int farePerKm,int waitingMinutes){
        super(distance, farePerKm);
        this.waitingMinutes = waitingMinutes;
    }
    @Override
    int  calculateFare(){
        return super.calculateFare()+(waitingMinutes*2);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int farePerKm = sc.nextInt();
        int waitingMinutes = sc.nextInt();
        if (distance < 1 || distance > 500 ||
            farePerKm < 1 || farePerKm > 100 ||
            waitingMinutes < 0 || waitingMinutes > 180) {
            
            System.out.println("Invalid Input");
    }else{
        PremiumRide p = new PremiumRide(distance, farePerKm, waitingMinutes);
        System.out.print("Final Fare: "+p.calculateFare());
    }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/premium-ride-fare/problem)