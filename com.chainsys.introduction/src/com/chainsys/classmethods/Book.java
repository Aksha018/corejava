package com.chainsys.classmethods;

public class Book {
	private String Author;
    private int price;
	private String Title;
	private String language;
	private int yearOfPublish;
	public Book(int i) {
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	}
	

