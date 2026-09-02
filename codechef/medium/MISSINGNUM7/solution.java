import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
    Scanner sc=new Scanner(System.in);
    int S=sc.nextInt();
    
   while(int i<5){
       if(S%i==0){
           i++;
       }else{
          System.out.println(i); 
       }
   }
  
	}
}