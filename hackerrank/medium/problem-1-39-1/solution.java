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
