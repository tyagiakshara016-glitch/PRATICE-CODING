import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T --> 0){
		    int N = sc.nextInt();
		     int ans = N % 3;
		    

            // Option 2: Jump to the next multiple of 5
            int next5 = ((N / 5) + 1) * 5;

            int operations = 1 + (next5 % 3);

            ans = Math.min(ans, operations);

            System.out.println(ans);
		}

	}
}
