package Java_interview_Programs;

import java.util.Scanner;

public class Primenumber 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num,flag=0,count;
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		for(count=2;count<=num/2;count++)
		{
			if(num%count==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.err.println("not Prime number");
		}
			else
				
			{
				System.err.println("Prime number");

			}
	
		}
       

}
