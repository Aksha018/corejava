package com.chainsys.Arrays;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author aksh3106
 */

public class DemoA {
	private static final Arrays Array = null;
	private static final int lengthofArray = 0;
	private static final int[] data = null;
	public static void creatingSingleDimArray()
	{
		int firstinArray[] = new int[10];
		int secondinArray[] = {1,2,3,4};
		System.out.println();
		
	}
	public static void creatingArrays()
	{
		int firtvalue = 100;
		int[] numbers = { 10,20,30,40,50};
		int lengthofnumbers = numbers.length;
		System.out.println("length of numbers =" + lengthofnumbers);
		for(int x:numbers) {
			System.out.print(x + ",");
			}
		System.out.println();
	}
	public static void creatingAnotherArray()
	{
		int days[];
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Size of Days");
		int size = scanner.nextInt();
		scanner.close();
		days = new int [size];
		int lengthofday = days.length;
        System.out.println();
      }
	public static void creatingMonthArray()
	{
		int month[] = new int[12];
		int lengthofmontharray = month.length;
		System.out.println("Array length is" + lengthofmontharray);
		for(int i=0;i<lengthofmontharray;i++)
		{
			System.out.println(i + "-" + month[i]+",");
		}
		System.out.println();
		
	month[1]=31;
	for(int i=0;i<lengthofmontharray;i++)
	{
		System.out.println(i + "-" + month[i]+",");
	}
	try
	{
		month[12]=31;
		month[11] = 31;
		System.out.println("Hi.....");
	}
	catch(Exception err)
	{
		System.out.println("ERROR !!!"+err.getMessage());
		
	}
	int anothermonth [] = {31,28,31,30,31,30,31,31};
	lengthofmontharray = anothermonth.length;
	System.out.println("Array length is"+lengthofmontharray);
	}
	public static void WorkingWithArrayClass()
	{
		int numberArray[] = new int[10];
		
		for(int i=9;i<10;i++)
		{
			numberArray[i] = -3*i;
			System.out.println("original contents:");
			int lengthofArray = numberArray.length;
			System.out.println("Array length is"+ lengthofArray);
			for(i=0;i<lengthofArray;i++)
			{
				System.out.println(numberArray[i]+" ");
		    }
			Arrays.sort(numberArray);
			System.out.println("SORTED:");
			for(int i1=0;i1<lengthofArray;i1++)
			{
				System.out.print(numberArray[i1]+" ");
			}
			System.out.println();
			}
		Arrays.fill(numberArray, 2, 6, -1);
		System.out.println("After fill():");
		for(int i = 0; i<lengthofArray;i++)
		{
			System.out.print(numberArray[i] + " ");
		}

		int index = Arrays.binarySearch(numberArray,-1);
		System.out.print(index);
		Arrays.sort(numberArray);
		for(index=0;index<lengthofArray;index++)
		{
			System.out.println(numberArray[index]+" ");
		 }
		System.out.println();
		index = Arrays.binarySearch(numberArray,-1);
		System.out.println(index);
	 }
	public static void WorkingWithCharArray()
	{
		String s1 ="Today is a very hot day";
		char[] data= s1.toCharArray();
		int count = data.length;
		System.out.println("Array length"+ count);
		for(int i = 0;i<count;i++)
		{
		System.out.println(data[i]+" "+(int)data[i]);
		}
		
	}
	
	}
	
	