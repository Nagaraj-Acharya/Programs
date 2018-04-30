package Java_interview_Programs;

import java.util.Scanner;

public class Uppercase_Chracter
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   String str;
	   System.out.println("Enter the String::");
	   str=sc.nextLine();
	   char res=firstUppercase(str);
	   
	   if (res == 0)
           System.out.println("No uppercase letter");
       else
           System.out.println(res);
	   
	}
	
	static char firstUppercase(String str)
	{
		 for (int i = 0; i < str.length(); i++)
	            if (Character.isUpperCase(str.charAt(i)))
	                return str.charAt(i);
	        return 0;
	}
}
