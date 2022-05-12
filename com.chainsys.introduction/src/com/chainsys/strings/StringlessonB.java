package com.chainsys.strings;

public class StringlessonB {
	public static void reverse()
	{
	java.util.Scanner scanner=new java.util.Scanner(System.in);
	System.out.println("Enter a sentence");
	String sentence="";
	try {
		sentence = scanner.nextLine();
		}
	finally {
		scanner.close();
	}
	int reversedString=sentence.length();
	while(reversedString>0)
	{
		System.out.println(sentence.charAt(reversedString-1));
		reversedString--;
	}
	
	}
	public static void verifyString(String s1) //verify and print
	{
		if(null==s1)
		{
			System.out.println("String is Null");
			return;
		}
		else
			System.out.println("String is Not Null"+s1);
		if(!s1.isEmpty())
			System.out.println("\t Not Empty");
		else
			System.out.println("\t String is Empty");
		
	}
	}
