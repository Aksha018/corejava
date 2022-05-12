package com.chainsys.strings;

public class StringBuilderDemo {
	private static final StringBuilder stringbuilder = null;

	public static void testA(StringBuilder StringBuilder)
	{
		String firstString="Hello how are yoy today.Is the weather hot or cold.";
		StringBuilder = new StringBuilder();
	System.out.println("length ="+stringbuilder.length());
     System.out.println("capacity= "+stringbuilder.capacity());
	stringbuilder.append(firstString);
	System.out.println("buffer ="+ stringbuilder);
	System.out.println("length ="+stringbuilder.length());
	System.out.println("capacity = "+ stringbuilder.capacity());
	
	firstString="wish it rains the week";
	stringbuilder.append(firstString);
	System.out.println("buffer ="+ stringbuilder);
	System.out.println("length = "+ stringbuilder.length());
	System.out.println("capacity ="+stringbuilder.capacity());
	
	//reduce capacity to length 
	stringbuilder.trimToSize();
	System.out.println("length = "+ stringbuilder.length());
	System.out.println("capacity ="+stringbuilder.capacity());
	
	stringbuilder.replace(3, 8, "This is aTest--");
	System.out.println("replace ="+ StringBuilder);
	
	stringbuilder.insert(10, "-This is a August-");
	System.out.println("insert ="+ stringbuilder);
	System.out.println("\t length ="+stringbuilder.length());
	System.out.println("\t capacity ="+ stringbuilder.capacity());
	
	stringbuilder.delete(5,20);
	System.out.println("insert ="+ stringbuilder);
	System.out.println("\t length ="+stringbuilder.length());
	System.out.println("\t capacity ="+ stringbuilder.capacity());
	
	
	
	
	
	
	
	
	}
	

}
