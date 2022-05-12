package com.chainsys.strings;

public class StringLessonA {
	public static void lessonOne()[]
	public static void lessonTwo()[]
    public static void creatingStringInaForLoop()
    {
		for(int count=0;count<10;count++)
		{
			String s1 = "Hello";
		}
    }
	public static void stringToArray()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a word");
		String firstString=scanner.nextLine();
		scanner.close();
		int stringlength=firstString.length();
		System.out.println("Length" +stringlength);
		char[] data=firstString.toCharArray();
		int dataarraylength=data.length;
		System.out.println("Length"+dataarraylength);
	}
	public static void stringToUpperLower()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a word");
		String firstString=scanner.nextLine();
		System.out.println("firstString");
		System.out.println("toUppercase="+ firstString);
		System.out.println("s1="+firstString);
		String strinInLowercase = firstString.toLowerCase();
		System.out.println("toLowercase="+ firstString);
		System.out.println("s2="+ firstString);
	  }
	public static void creatingStringInaForLoop() {[]
	public static void stringtoCharArray() {[]
	public static void stringToUpperLower() {[]
    public static void testStringTrim()[]
    public static void testsplit() {
		String firstString = "Tom and Jerry are good friends";
		String trimmedString = firstString.trim();
		String[] data = trimmedString.split(" ");
		int count = data.length;
		System.out.println("Word Count" + count);
		for (int index =0;index<count;index++)
		{
			System.out.println(data[index]);
		}
		
		
	}
	
	}

	
			
	
	