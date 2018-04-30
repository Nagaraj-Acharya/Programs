package Java_interview_Programs;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 
		 String str = "nagaraj";
		 int count=0;
		 char[] input=str.toCharArray();
		 
		 for (int i = 0; i < str.length(); i++) {
			   for (int j = i + 1; j < str.length(); j++) {
			    if (input[i] == input[j]) {
			     System.out.println(input[j]);
			     count++;
			     break;
			    }
			   }
		 }

}
}
