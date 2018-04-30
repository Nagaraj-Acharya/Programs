package Java_interview_Programs;

public class ConvertString_ConvertInteger
{

	public static void main(String[] args) 
	{
		//converting String to integer
		String str1="10";
		String str2="20";
		String str3="30";

		int int1=Integer.parseInt(str1);
		int int2=Integer.parseInt(str2);
		int int3=Integer.parseInt(str3);
		
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(int3);
		System.out.println("\n");


		
		//converting integer to String integer
		int myint1=10;
		int myint2=20;
		int myint3=30;

		String mystr1="";
		String mystr2="";
		String mystr3="";

		mystr1=Integer.toString(myint1);
		mystr2=Integer.toString(myint2);
		mystr3=Integer.toString(myint3);

		System.out.println(mystr1);
		System.out.println(mystr2);
		System.out.println(mystr3);


		
	}

}
