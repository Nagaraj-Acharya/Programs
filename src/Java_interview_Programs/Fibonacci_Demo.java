package Java_interview_Programs;

import java.util.Scanner;

public class Fibonacci_Demo
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int num=sc.nextInt();
        
        System.out.println("\n"+num+" value in fibonacci series is : "+fibrec(num));
        
    }
    public static int fibrec(int num)
    {
        if(num==1)
        {   
            return 0;
        }
        if(num==2)
        {
            return 1;
        }
        return fibrec(num-1)+fibrec(num-2);
         
    }


}
