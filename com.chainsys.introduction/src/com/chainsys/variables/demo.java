package com.chainsys.variables;

public class demo {

	public static int DataA; //static global variable 
	public int DataB = 0; //immutable global variable(not static)
	public final static int Data=300;//constant
	
	public demo(int dataB)
	{
		/* Assigning value to the global read only field (this.DataB)*/
		this.DataB=dataB;
	}
	/**
	 * static method can be called without an object
	 */
	public static void sayHello()
	{
	System.out.println("Hello Developer !!!");	
	}
	public void greetuser()
	{
		System.out.println("Greeting USER!!!");
	}
	public static void testImmutableVariable()
	/*cannot make a reference to the non-static field demoa.DemoB*/
	// Demoa.DataB - 123
	/**
	 * first create an object or the class
	 * pass an int value as an argument to the constructor 
	 * access the immutable instance field using the object reference 
	 */
	Demoa firstObject=new Demoa(123);
	System.out.println(firstObject.DataB);
	/**
	 * value assigned to an immutale field cannot be changed 
	 * value for the immutale field can be assigned only through the constructor
	 */
	firstObject.DataB=567
	

}
