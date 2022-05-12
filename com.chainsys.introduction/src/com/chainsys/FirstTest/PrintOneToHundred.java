package com.chainsys.FirstTest;

public class PrintOneToHundred {
	public static void main(String[] args)
	{
		for (int i=1;i<100;i++)
		{
			if(i%3==0)
			{
				System.out.println("Multiple of three"+" "+i+"=Fizz");
				
			}
			if(i%5==0)
			{
				System.out.println("Multiple of five"+" "+i+"=Buzz");
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println("Multiple of three and five"+" "+i+"=FizzBuzz");
			}
		}
	}

}
