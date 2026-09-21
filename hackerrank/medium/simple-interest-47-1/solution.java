import java.io.*;
import java.util.*;
class Interest{
    int principal;
    int rate;
    int time;
    public void calculateInterest(){
        int simple = (principal*rate*time)/100;
        System.out.println("Simple Interest: "+simple);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Interest i = new Interest();
        i.principal = sc.nextInt();
        i.rate = sc.nextInt();
        i.time = sc.nextInt();
        if(1>i.principal||i.principal>1000000||1>i.rate||i.rate>100||1>i.time||i.time>50){
            System.out.println("Invalid Input");
            return;
        }
        i.calculateInterest();
    }
}
