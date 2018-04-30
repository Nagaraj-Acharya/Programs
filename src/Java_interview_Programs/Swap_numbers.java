package Java_interview_Programs;

import java.util.Scanner;

public class Swap_numbers
{

	public static void main(String[] args)
	{
      int x,y;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of x::");
      x=sc.nextInt();
      System.out.println("Enter the value of y::");
      y=sc.nextInt();
      
      System.out.println("before swapping the rhe value of x and y is::"+x+","+y);

      x=x+y;
      y=x-y;
      x=x-y;
      
      System.out.println("after swapping the rhe value of x and y is::"+x+","+y);

	}

}
