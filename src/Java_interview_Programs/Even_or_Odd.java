package Java_interview_Programs;

import java.util.Scanner;

public class Even_or_Odd
{

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     int num;
     System.out.println("Enter the number::");
     num=sc.nextInt();
     
     if(num%2==0)
     {
         System.err.println(" The number is Even");
     }
     else
     {
         System.out.println(" The number is Odd"); 
     }
	}

}
