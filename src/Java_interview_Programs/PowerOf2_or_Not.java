package Java_interview_Programs;

import java.util.Scanner;

public class PowerOf2_or_Not
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int num,flag=0;
		System.out.println("Enter number::");
		num=sc.nextInt();
		while(num>1)
		{
		if(num%2!=0)
		{
		flag=1;
		break;
		}
		num=num/2;
		}
		if(flag==1)
		{
			System.out.println("The number is not power of 2");
		}

		else
		{
			System.out.println("The number is power of 2");
		}
			}
}