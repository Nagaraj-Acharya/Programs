package Java_interview_Programs;

import java.util.Scanner;

public class Reverse_String 
{

	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
    String str, reverse="";
    
    System.out.println("Enter The String::");
	str=sc.nextLine();
	
	for(int i=str.length()-1;i>=0;i--)
	{
		reverse=reverse+str.charAt(i);
	}
	 System.out.println("Reversed string is**");
     System.out.println(reverse);
	}

}
