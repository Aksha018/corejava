package com.chainsys.introduction;

public class fifth {

	private static String countB;

	public static void main(String[] args) {
	printTriangleB();
	}
	private static void printNumbersTentoOne() {
		int count=0;
		for(count =0;count<=10;count--)
		{
			System.out.print(count +" ");
		}
	}
	public static void printTriangle()
	{
		int countA =0;
		for(countA =1;countA <=10;countA++)
		{
			for(countB = 1;countB<=countA;countB++)
			{
				System.out.print(countB +" ");
			}
		System.out.print();
		}                                                                 
public static void printTriangleB()
{
	int countA =0;
	for(countA =1;countA <=10;countA++)
	{
		for(int countB =10;countB<countA;countB++)
		System.out.print(".");	
	}
	for(int countC =countA;countC>=1;countC--)

	System.out.println(countC);
	}
	System.out.println();
}
}

public static void pattern