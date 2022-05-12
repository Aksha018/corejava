package com.chainsys.introduction;
import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
       checkusername();
	}
	public static void checkusername()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name");
		String username = sc.nextLine();
		sc.close();
		System.out.println("Name is " + username);
		char[] nameAsCharacters = username.toCharArray();
		int lengthOfCharArray=nameAsCharacters.length;
		System.out.println("Length of your name is:"+ lengthOfCharArray);
		for(int index=0;index<lengthOfCharArray;index++)
		{
			System.out.println(index +" " +nameAsCharacters[index]);
		}
		}
	}
       
			