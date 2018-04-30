package Java_interview_Programs;

import java.util.Scanner;

public class String_Palindrome
{

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        String str, reverse="";
        
        System.out.println("Enter the String");
        str=sc.nextLine();
        
        for(int i=str.length()-1;i>=0;i--)
        {
        	reverse=reverse+str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("Enter the String palindrome");
	
        }
        else
        {
            System.out.println("Enter the String not palindrome");

        }
        
	}

}
