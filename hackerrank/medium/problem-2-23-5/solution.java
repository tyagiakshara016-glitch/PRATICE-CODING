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
