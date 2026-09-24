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
