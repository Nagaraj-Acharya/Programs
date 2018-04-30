package Java_interview_Programs;

import java.util.Scanner;

public class Largest_of_Three 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        
        System.out.print("Enter the num1::");
        num1=sc.nextInt();
        System.out.print("Enter the num2::");
        num2=sc.nextInt();
        System.out.print("Enter the num3::");
        num3=sc.nextInt();
        
        if(num1>num2 && num1>num3)
        {
        	System.out.println("The largset number is::"+num1);
        }
        
        else if(num2>num1 && num2>num3)
        {
        	System.out.println("The largset number is::"+num2);
        }
        
        else if(num3>num1 && num3>num2)
        {
        	System.out.println("The largset number is::"+num3);
        }
        else
        {
        	System.out.println("All the numbers are equal");
	
        }

	}

}
