import java.io.*;
import java.util.*;

class Vehicle {
    int serviceCost;
    public void calculateServiceCost() {
        System.out.println("Basic Service Cost: " + serviceCost);
    }
}
class Car extends Vehicle {
    int extraCost;
     @Override
        public void calculateServiceCost() {
        super.calculateServiceCost();
        int finalCost = serviceCost + extraCost;
        System.out.println("Final Service Cost: " + finalCost);
    }
}
public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int serviceCost = sc.nextInt();
    int extraCost = sc.nextInt();
    if (serviceCost < 1 || serviceCost > 100000 ||
            extraCost < 0 || extraCost > 50000) {
            System.out.println("Invalid Input");
            return;
        }
        Car c = new Car();
        c.serviceCost = serviceCost;
        c.extraCost = extraCost;
        c.calculateServiceCost();
    }
}
