package com.chainsys.FirstTest;
import java.util.Scanner;

public class ThreeDigitInput {
	public static void main(String[] args)
	{
	  threeDigitInput();
	}
	public static void threeDigitInput()
	{
		int a,b,c,d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		c=a;
		while(a>0)
		{
			b=a%10;
			d=d+(b*b*b);
			a=a/10;
		}
		if(d==c)
		{
			System.out.println("Same as Input");
		}
		else
		{
			System.out.println("Different Number");
		}
	}
		
		
		
	}
	

