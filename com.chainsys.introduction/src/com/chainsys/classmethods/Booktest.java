package com.chainsys.classmethods;

public class Booktest {
	private static final String Revolution = "Revolution";

	public static void Booktest()
	{
		Book firstBook=new Book(12546);
		firstBook.setAuthor("chetan");
		firstBook.setYearOfPublish(2006);
		firstBook.setTitle(Revolution);
		firstBook.setLanguage("english");
		firstBook.setPrice(2000);
		System.out.println(firstBook.getAuthor());
		System.out.println(firstBook.getYearOfPublish());
		System.out.println(firstBook.getLanguage());
		System.out.println(firstBook.getTitle());
		System.out.println(firstBook.getPrice());
	}
}

